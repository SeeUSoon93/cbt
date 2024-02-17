package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Builder
    public User(Long userIdx, String userEmail, String userPw) {
        this.userIdx = userIdx;
        this.userEmail = userEmail;
        this.userPw = userPw;
    }
}
