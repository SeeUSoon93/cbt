package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
