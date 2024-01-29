package com.example.islolback.member.dto;

import com.example.islolback.utils.enums.Tier;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberSaveReqDTO {
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
}
