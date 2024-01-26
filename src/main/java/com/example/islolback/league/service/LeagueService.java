package com.example.islolback.league.service;

import com.example.islolback.league.entity.League;
import com.example.islolback.league.repository.LeagueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LeagueService {

    private final LeagueRepository leagueRepository;

    public void save(League league) {
        leagueRepository.save(league);
    }

}
