package com.example.islolback.auth.security;

import com.example.islolback.member.entity.Member;
import com.example.islolback.utils.enums.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUserDetails implements UserDetails {
    private long mbrSeq;
    private String mbrId;
    private String mbrPwd;
    private Role mbrRole;

    public CustomUserDetails(Member member) {
        this.mbrSeq = member.getMbrSeq();
        this.mbrId = member.getMbrId();
        this.mbrPwd = member.getMbrPwd();
        this.mbrRole = member.getMbrRole();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new ArrayList<>();
        collection.add(new SimpleGrantedAuthority(mbrRole.name()));
        return collection;
    }

    @Override
    public String getPassword() {
        return mbrPwd;
    }

    @Override
    public String getUsername() {
        return mbrId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
