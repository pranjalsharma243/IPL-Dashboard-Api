package com.ps.ipl.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ps.ipl.data.model.Match;

public interface MatchRepository extends CrudRepository<Match, Long> {
	List<Match> findByTeam1OrTeam2OrderByDateDesc(String teamone,String teamtwo,Pageable pageable);

	@Query("select m from Match m where (m.team1= :teamname or m.team2= :teamname) and m.date between :startDate and :endDate order by date desc")
	List<Match> getMatchesByTeamBetweenDatesxyzer(@Param("teamname") String teamname,
			@Param("startDate") LocalDate startDate,
			@Param("endDate") LocalDate endDate
			);
    
}
