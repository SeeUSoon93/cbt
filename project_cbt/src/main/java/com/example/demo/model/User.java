package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userIdx;

    private String userEmail;

    private String userPw;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<MemoQuiz> memoQuizs;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<KnowQuiz> knowQuizs;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<DontKnowQuiz> dontKnowQuizs;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<CountQuiz> countQuizs;

    @Builder
    public User(Long userIdx, String userEmail, String userPw) {
        this.userIdx = userIdx;
        this.userEmail = userEmail;
        this.userPw = userPw;
    }
}
