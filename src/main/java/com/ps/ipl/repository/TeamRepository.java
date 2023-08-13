package com.ps.ipl.repository;

import org.springframework.data.repository.CrudRepository;

import com.ps.ipl.data.model.Team;

public interface TeamRepository extends CrudRepository<Team,Long> {

	Team findByteamname(String teamname); //ye kya krta h ki jo bhi teamname=teamname paramater wala match hua wo instance return krta h we know ki apne case m one teamname he h toh ek Team return krega,agar jada hote toh List<Team> return kr skte the cool :-) findBy k baad s check krta h match krna
	
	
}
