package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Eric Grabe - egrabe CIS175 - Fall 2023 Oct 8, 2023
 */

@Entity(name = "team")
@Table(name = "team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teamId;
	private String affiliation;
	private String name;
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Hero> heroes;
	
	public Team() {
		super();
	}
	
	public Team(String name, String affiliation) {
		this.name = name;
		this.affiliation = affiliation;
	}
	
	/**
	 * @return the teamId
	 */
	public int getTeamId() {
		return teamId;
	}
	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	/**
	 * @return the affiliation
	 */
	public String getAffiliation() {
		return affiliation;
	}
	/**
	 * @param affiliation the affiliation to set
	 */
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the heroes
	 */
	public List<Hero> getHeroes() {
		return heroes;
	}
	/**
	 * @param heroes the heroes to set
	 */
	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
	}
	
	
}
