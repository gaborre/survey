package com.gabn.survey.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveyAnswerDTO implements Serializable {
    private Integer id;
    private int survey;
    private int question;
    private int answer;
    private String answerText;
    private int userId;
}
