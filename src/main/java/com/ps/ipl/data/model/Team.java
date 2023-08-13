package com.ps.ipl.data.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity

public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String teamname;
	private long teammatches;
	private long totalwins;
	@Transient
	private List<Match> matches;
	
	
	public Team() {
		super();
	}
	public Team(String teamname, long teammatches) {
		super();
		this.teamname = teamname;
		this.teammatches = teammatches;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public long getTeammatches() {
		return teammatches;
	}
	public void setTeammatches(long teammatches) {
		this.teammatches = teammatches;
	}
	public long getTotalwins() {
		return totalwins;
	}
	public void setTotalwins(long totalwins) {
		this.totalwins = totalwins;
	}
	public List<Match> getMatches() {
		return matches;
	}
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	@Override
	public String toString() {
		return "Team [teamname=" + teamname + ", teammatches=" + teammatches + ", totalwins=" + totalwins + "]";
	}


}
