package com.ps.ipl.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ps.ipl.data.model.Match;
import com.ps.ipl.data.model.Team;
import com.ps.ipl.repository.MatchRepository;
import com.ps.ipl.repository.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository tr;
	@Autowired
    private MatchRepository mr;
	public Team findByteamname(String teamname) {
		
		return tr.findByteamname(teamname);
	}

	public List<Match> getByTeam1OrTeam2(String teamname) {
		Pageable pageable=PageRequest.of(0, 4);
		return mr.findByTeam1OrTeam2OrderByDateDesc(teamname,teamname,pageable);
		
	}

	public List<Match> getMatchesByTeamBetweenDatesserviceit(String teamname, LocalDate startDate,LocalDate endDate) {
		// TODO Auto-generated method stub
		return mr.getMatchesByTeamBetweenDatesxyzer(teamname,startDate,endDate);
		
	}

	public Iterable<Team> getAllTeams() {
		return tr.findAll();
		
		
	}
	

	
	
	
	
	
}
