package com.example.islolback;


import com.example.islolback.member.entity.Member;
import com.example.islolback.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class BaseEntityTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void saveTest(){
        Member test = Member.builder().mbrId("test").build();
        Member save = memberRepository.save(test);
        System.out.println("save = " + save);
    }

    @Test
    public void updateTest() {
        Optional<Member> byId = memberRepository.findById(1L);
        if (byId.isPresent()) {
            Member member = byId.get();
            member.setMbrAddr("tesetAddr");
            memberRepository.save(member);
        }
    }
}
