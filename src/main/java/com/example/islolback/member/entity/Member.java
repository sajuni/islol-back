package com.example.islolback.member.entity;

import com.example.islolback.league.entity.League;
import com.example.islolback.naejeon.entity.Naejeon;
import com.example.islolback.utils.entity.BaseEntity;
import com.example.islolback.utils.enums.Role;
import com.example.islolback.utils.enums.Tier;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mbrSeq;
    private String mbrId;
    private String mbrGmId;
    private String mbrPwd;
    private String mbrNm;
    private String mbrBirthDAy;
    private String mbrAddr;
    private Tier mbrSoleTier;
    private Tier mbrFreeTier;
    private Tier mbrMaxSoleTier;
    private Tier mbrMaxFreeTier;
    private Tier mbrNjTier;
    private Tier mbrLgTier;
    private Role mbrRole;

    @ManyToMany
    @JoinTable(
            name = "naejeon_participant",
            joinColumns = @JoinColumn(name = "mbrSeq"),
            inverseJoinColumns = @JoinColumn(name = "naejeonId")
    )
    private Set<Naejeon> naejeons = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "league_participant",
            joinColumns = @JoinColumn(name = "mbrSeq"),
            inverseJoinColumns = @JoinColumn(name = "leagueId")
    )
    private Set<League> leagues = new HashSet<>();

    @Builder
    public Member(String id) {
        mbrId = id;
    }

}
