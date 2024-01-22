package com.example.islolback.member.entity;

import com.example.islolback.utils.entity.BaseEntity;
import com.example.islolback.utils.enums.Role;
import com.example.islolback.utils.enums.Tier;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
}
