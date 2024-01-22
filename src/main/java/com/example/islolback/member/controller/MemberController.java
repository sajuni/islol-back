package com.example.islolback.member.controller;

import com.example.islolback.member.entity.Member;
import com.example.islolback.member.repository.MemberRepository;
import com.example.islolback.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/save")
    public ResponseEntity<?> save(Member member) {
        memberService.save(member);
        return ResponseEntity.ok("ok");
    }

}
