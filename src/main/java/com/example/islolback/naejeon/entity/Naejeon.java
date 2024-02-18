package com.example.islolback.naejeon.entity;

import com.example.islolback.utils.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Naejeon extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long naejeonId;

    @Column(length = 100)
    private String naejeonNm;

    @OneToMany(mappedBy = "naejeon")
    private Set<NaejeonInfo> naejeonInfos = new HashSet<>();

    @Builder
    public Naejeon(String naejeonNm) {
        this.naejeonNm = naejeonNm;
    }

}


