package com.example.islolback.auth.jwt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TokenInfo {
    private String grantType;
    private String accessToken;
    private String refreshToken;
}
