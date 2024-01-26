package com.example.islolback.league.repository;

import com.example.islolback.league.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {
}
