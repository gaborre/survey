package com.gabn.survey.survey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveyAnswer {
    private Integer id;
    private int survey;
    private int question;
    private int answer;
    private String answerText;
    private int userId;
}
