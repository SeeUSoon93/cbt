package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Builder;

@Table(name = "dont_know_quizs")
public class DontKnowQuiz {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizIdx")
    private Quiz quiz;

    @Builder
    public DontKnowQuiz(User user, Quiz quiz){
        this.user = user;
        this.quiz = quiz;
    }

}
