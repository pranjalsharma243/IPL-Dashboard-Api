package com.ps.ipl.data.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity

public class Match {
	@Id
	private long id;
    private String city; 
	private LocalDate date;
	private String playerOfMatch;
	private String venue;
	private String team1;
	private String team2 ;
	private String tossWinner ;
	private String tossDecision ;
	private String matchWinner;
	private String result ;
	private String resultMargin ;
	private String method ;
	private String umpire1;
	private String umpire2;

	public void setId(long id) {
		this.id = id;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public void setTossWinner(String tossWinner) {
		this.tossWinner = tossWinner;
	}

	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}

	public void setMatchWinner(String matchWinner) {
		this.matchWinner = matchWinner;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setResultMargin(String resultMargin) {
		this.resultMargin = resultMargin;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}

	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}

	public long getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getPlayerOfMatch() {
		return playerOfMatch;
	}

	public String getVenue() {
		return venue;
	}

	public String getTeam1() {
		return team1;
	}

	public String getTeam2() {
		return team2;
	}

	public String getTossWinner() {
		return tossWinner;
	}

	public String getTossDecision() {
		return tossDecision;
	}

	public String getMatchWinner() {
		return matchWinner;
	}

	public String getResult() {
		return result;
	}

	public String getResultMargin() {
		return resultMargin;
	}

	public String getMethod() {
		return method;
	}

	public String getUmpire1() {
		return umpire1;
	}

	public String getUmpire2() {
		return umpire2;
	}

	@Override
	public String toString() {
		return "Match{" +
				"id=" + id +
				", city='" + city + '\'' +
				", date=" + date +
				", playerOfMatch='" + playerOfMatch + '\'' +
				", venue='" + venue + '\'' +
				", team1='" + team1 + '\'' +
				", team2='" + team2 + '\'' +
				", tossWinner='" + tossWinner + '\'' +
				", tossDecision='" + tossDecision + '\'' +
				", matchWinner='" + matchWinner + '\'' +
				", result='" + result + '\'' +
				", resultMargin='" + resultMargin + '\'' +
				", method='" + method + '\'' +
				", umpire1='" + umpire1 + '\'' +
				", umpire2='" + umpire2 + '\'' +
				'}';
	}
}
