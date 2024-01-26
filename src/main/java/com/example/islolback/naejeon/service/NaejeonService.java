package com.example.islolback.naejeon.service;

import com.example.islolback.naejeon.repository.NaejeonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NaejeonService {

    private final NaejeonRepository naejeonRepository;

}

