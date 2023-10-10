package controller.helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Team;
import model.Hero;

/**
 * @author Eric Grabe - egrabe CIS175 - Fall 2023 Oct 8, 2023
 */
public class TeamHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("SuperHeroTeams");

	public void persist(Team model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}

	public void delete(Team model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Team.class, model.getTeamId()));
		manager.getTransaction().commit();
		manager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Team> showAllTeams() {
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM team i");
		List<Team> allItems = q.getResultList();
		manager.close();
		return allItems;

	}

	public void update(Team model) {
		EntityManager manager = factory.createEntityManager();
		Team dbEntity = manager.find(Team.class, model.getTeamId());
		manager.getTransaction().begin();
		dbEntity.setName(model.getName());
		dbEntity.setAffiliation(model.getAffiliation());
		manager.getTransaction().commit();
		manager.close();

	}

	public Team searchTeamByName(String name) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Team> query = manager.createQuery("SELECT i FROM team AS i WHERE i.name = :name", Team.class);
		query.setParameter("name", name);
		System.out.println(name);
		Team dbEntity;
		try {
			dbEntity = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} finally {
			manager.close();
		}
		return dbEntity;
	}

}