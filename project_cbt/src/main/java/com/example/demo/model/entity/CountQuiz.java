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
@Table(name = "count_quizs")
public class CountQuiz {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizIdx")
    private Quiz quiz;

    private int wrongCount;
    private int CorrectCount;

    @Builder
    public CountQuiz(User user, Quiz quiz, int wrongCount, int correctCount){
        this.user = user;
        this.quiz = quiz;
        this.CorrectCount = correctCount;
        this.wrongCount = wrongCount;
    }
}


