package com.example.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "count_quizs")
public class CountQuiz {

    private User user;
    private Quiz quiz;
    private int wrongCount;
    private int CorrectCount;
}


