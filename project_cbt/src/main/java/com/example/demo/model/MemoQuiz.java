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
@Table(name = "memo_quizs")
public class MemoQuiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memo_quiz_idx", updatable = false)
    private Long memoQuizIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizIdx")
    private Quiz quiz;

    private String quizMemo;

    @Builder
    public MemoQuiz(User user, Quiz quiz, String quizMemo){
        this.user = user;
        this.quiz = quiz;
        this.quizMemo = quizMemo;
    }
}
