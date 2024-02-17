package com.example.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name = "dont_know_quizs")
public class DontKnowQuiz {

    private User user;
    private Quiz quiz;
}
