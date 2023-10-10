package controller.helpers;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 8, 2023
 */
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Hero;


public class HeroHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("SuperHeroTeams");
	TeamHelper teamHelper = new TeamHelper();
	
	public void persist(Hero model) {
		EntityManager manager = factory.createEntityManager();
		model.setTeam(teamHelper.searchTeamByName(model.getTeam().getName()));
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Hero model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Hero.class, model.getHeroId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Hero> showAllHeroes() {
		EntityManager manager = factory.createEntityManager();
		List<Hero> allItems = manager.createQuery("SELECT i FROM hero i").getResultList();
		manager.close();
		return allItems;
		
	}

	public void update(Hero model) {
		EntityManager manager = factory.createEntityManager();
		model.setTeam(teamHelper.searchTeamByName(model.getTeam().getName()));
		Hero dbEntity = manager.find(Hero.class, model.getHeroId());
		manager.getTransaction().begin();
		dbEntity.setHeroName(model.getHeroName());
		dbEntity.setCommonName(model.getCommonName());
		dbEntity.setPower(model.getPower());
		dbEntity.setTeam(model.getTeam());
		manager.getTransaction().commit();
		manager.close();
		
	}

	public Hero searchHeroByName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Hero> query = manager.createQuery("SELECT i FROM hero AS i WHERE i.heroName = :heroName", Hero.class);
		query.setParameter("heroName", oldName);
		Hero dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
}