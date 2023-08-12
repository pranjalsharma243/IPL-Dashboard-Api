package com.ps.ipl.controller;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToJsr310Converter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ps.ipl.data.model.Match;
import com.ps.ipl.data.model.Team;
import com.ps.ipl.service.TeamService;
@RestController
public class TeamController {
@Autowired
private TeamService ts;
@GetMapping("/teams")
@CrossOrigin
  
   public Iterable<Team> getAllTeams()
   {
	return ts.getAllTeams();
   }

   @GetMapping("/team/{teamname}")
   @CrossOrigin
	public Team getTeam(@PathVariable String teamname)
	{
	   Team team=ts.findByteamname(teamname);
	   team.setMatches(ts.getByTeam1OrTeam2(teamname));
	   return team; 
	}
   @GetMapping("/team/{teamname}/matches")
   @CrossOrigin
   public List<Match> getMatchesByTeamBetweenDatesserviceit(@PathVariable String teamname,@RequestParam int year )
   {
	   LocalDate startDate=LocalDate.of(year, 1, 1);
	   LocalDate endDate=LocalDate.of(year+1, 1, 1);
	  return ts.getMatchesByTeamBetweenDatesserviceit(teamname,startDate,endDate);
	   
   }
	
	
}
