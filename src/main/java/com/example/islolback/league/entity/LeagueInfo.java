package com.example.islolback.league.entity;

import com.example.islolback.member.entity.Member;
import com.example.islolback.utils.enums.Team;
import jakarta.persistence.*;

@Entity
public class LeagueInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leagueInfoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mbrSeq")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leagueId")
    private League league;

    @Enumerated(EnumType.STRING)
    private Team team;

}
