package com.example.demo.model.entity;

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
@Table(name = "quizs")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quizIdx;

    private int quizYear, quizCnt, quizAnswer;

    private  String quizSubject, quizContent, quizExamples, quizComment;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<MemoQuiz> memoQuizs;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<KnowQuiz> knowQuizs;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<DontKnowQuiz> dontKnowQuizs;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<CountQuiz> countQuizs;

    @Builder
    public Quiz(Long quizIdx, int quizYear, int quizAnswer, int quizCnt, String quizComment, String quizContent, String quizExamples, String quizSubject) {
        this.quizIdx = quizIdx;
        this.quizYear = quizYear;
        this.quizAnswer = quizAnswer;
        this.quizCnt = quizCnt;
        this.quizComment = quizComment;
        this.quizContent = quizContent;
        this.quizExamples = quizExamples;
        this.quizSubject = quizSubject;
    }
}
