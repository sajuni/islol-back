package com.example.islolback.auth.security;

import com.example.islolback.common.exception.BizException;
import com.example.islolback.member.entity.Member;
import com.example.islolback.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Member> byMbrId = memberRepository.findByMbrId(username);
        if (byMbrId.isPresent()) {
            Member member = byMbrId.get();
            return new CustomUserDetails(member);
        } else {
            throw new BizException("ID " + username + "가 존재하지 않습니다.", HttpStatus.ACCEPTED);
        }
    }
}
