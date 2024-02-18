package com.example.islolback.naejeon.entity;

import com.example.islolback.member.entity.Member;
import com.example.islolback.utils.enums.GameResult;
import com.example.islolback.utils.enums.Team;
import jakarta.persistence.*;

@Entity
public class NaejeonInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long naejeonInfoId;

    @ManyToOne
    @JoinColumn(name = "mbrSeq")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "naejeonId")
    private Naejeon naejeon;

    @Enumerated(EnumType.STRING)
    private Team team;

    @Enumerated(EnumType.STRING)
    private GameResult gameResult;
}
