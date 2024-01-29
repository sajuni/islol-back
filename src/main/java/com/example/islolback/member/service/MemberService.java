package com.example.islolback.member.service;

import com.example.islolback.member.dto.MemberSaveReqDTO;
import com.example.islolback.member.entity.Member;
import com.example.islolback.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(MemberSaveReqDTO reqDTO) {

        Member member = Member.builder().reqDTO(reqDTO).build();
        memberRepository.save(member);
    }


}
