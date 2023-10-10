package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 8, 2023
 */


	@Entity(name = "hero")
	@Table(name = "hero")
	public class Hero {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int heroId;

		private String heroName;
		private String commonName;
		private String power;
		@ManyToOne
		@JoinColumn(name = "TEAMID", nullable=false)
		private Team team = new Team();
		
		public Hero() {
			super();
		}
		
		public Hero(String commonName, String heroName, String power, Team team) {
			this.commonName = commonName;
			this.heroName = heroName;
			this.power = power;
			this.team = team;
		}
		
		
		/**
		 * @return the heroId
		 */
		public int getHeroId() {
			return heroId;
		}
		/**
		 * @param heroId the heroId to set
		 */
		public void setHeroId(int heroId) {
			this.heroId = heroId;
		}
		/**
		 * @return the heroName
		 */
		public String getHeroName() {
			return heroName;
		}
		/**
		 * @param heroName the heroName to set
		 */
		public void setHeroName(String heroName) {
			this.heroName = heroName;
		}
		/**
		 * @return the commonName
		 */
		public String getCommonName() {
			return commonName;
		}
		/**
		 * @param commonName the commonName to set
		 */
		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}
		/**
		 * @return the power
		 */
		public String getPower() {
			return power;
		}
		/**
		 * @param power the power to set
		 */
		public void setPower(String power) {
			this.power = power;
		}
		/**
		 * @return the team
		 */
		public Team getTeam() {
			return team;
		}
		/**
		 * @param team the team to set
		 */
		public void setTeam(Team team) {
			this.team = team;
		}
		
		
}
