package com.example.islolback.league.entity;

import com.example.islolback.member.entity.Member;
import com.example.islolback.utils.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class League extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leagueId;

    @Column(length = 100)
    private String leagueNm;

    @OneToMany(mappedBy = "league")
    private Set<LeagueInfo> leagueInfos = new HashSet<>();

    @Builder
    public League(String leagueNm) {
        this.leagueNm = leagueNm;
    }
}

