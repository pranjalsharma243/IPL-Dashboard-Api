package com.ps.ipl.data.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Entity
@ToString
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
}
