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
    @Column(name = "user_idx", updatable = false)
    private Long userIdx;

    @Column(name = "user_email", unique = true)
    private String userEmail;

    @Column(name = "user_pw")
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
    public User(String userEmail, String userPw) {
        this.userEmail = userEmail;
        this.userPw = userPw;
    }
}
