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
@Table(name = "quizs")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "quiz_idx", updatable = false)
    private Long quizIdx;

    @Column(name = "quiz_year")
    private int quizYear;
    @Column(name = "quiz_cnt")
    private int quizCnt;

    @Column(name = "quiz_subject")
    private String quizSubject;

    @Column(name = "quiz_content")
    private String quizContent;

    @Column(name = "quiz_examples")
    private String quizExamples;

    @Column(name = "quiz_answer")
    private int quizAnswer;

    @Column(name = "quiz_comment")
    private String quizComment;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<MemoQuiz> memoQuizs;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<KnowQuiz> knowQuizs;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<DontKnowQuiz> dontKnowQuizs;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<CountQuiz> countQuizs;
}
