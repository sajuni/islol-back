package com.example.islolback.member.controller;

import com.example.islolback.member.dto.MemberSaveReqDTO;
import com.example.islolback.member.entity.Member;
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
    public ResponseEntity<?> save(MemberSaveReqDTO reqDto) {
        memberService.save(reqDto);
        return ResponseEntity.ok("ok");
    }

}
