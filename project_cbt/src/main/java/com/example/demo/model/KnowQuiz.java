package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "know_quizs")
public class KnowQuiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long knowQuizIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizIdx")
    private Quiz quiz;

    @Builder
    public KnowQuiz(User user, Quiz quiz){
        this.user = user;
        this.quiz = quiz;
    }

}
