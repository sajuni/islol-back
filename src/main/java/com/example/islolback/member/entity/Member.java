package com.example.islolback.member.entity;

import com.example.islolback.league.entity.LeagueInfo;
import com.example.islolback.member.dto.MemberSaveReqDTO;
import com.example.islolback.naejeon.entity.NaejeonInfo;
import com.example.islolback.utils.entity.BaseEntity;
import com.example.islolback.utils.enums.Role;
import com.example.islolback.utils.enums.Tier;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    @Enumerated(EnumType.STRING)
    private Tier mbrSoleTier;
    @Enumerated(EnumType.STRING)
    private Tier mbrFreeTier;
    @Enumerated(EnumType.STRING)
    private Tier mbrMaxSoleTier;
    @Enumerated(EnumType.STRING)
    private Tier mbrMaxFreeTier;
    @Enumerated(EnumType.STRING)
    private Tier mbrNjTier;
    @Enumerated(EnumType.STRING)
    private Tier mbrLgTier;
    @Enumerated(EnumType.STRING)
    private Role mbrRole;

    @OneToMany(mappedBy = "member")
    private Set<NaejeonInfo> naejeonInfos = new HashSet<>();

    @OneToMany(mappedBy = "member")
    private Set<LeagueInfo> leagueInfos = new HashSet<>();

    @Builder
    public Member(MemberSaveReqDTO reqDTO) {
        mbrId = reqDTO.getMbrGmId();
        mbrGmId = reqDTO.getMbrGmId();
        mbrPwd = reqDTO.getMbrPwd();
        mbrNm = reqDTO.getMbrNm();
        mbrBirthDAy = reqDTO.getMbrBirthDAy();
        mbrAddr = reqDTO.getMbrAddr();
        mbrSoleTier = reqDTO.getMbrSoleTier();
        mbrFreeTier = reqDTO.getMbrFreeTier();
        mbrMaxSoleTier = reqDTO.getMbrMaxSoleTier();
        mbrMaxFreeTier = reqDTO.getMbrMaxFreeTier();
        mbrNjTier = reqDTO.getMbrNjTier();
        mbrLgTier = reqDTO.getMbrLgTier();
    }

}
