package com.gabn.survey.survey.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomSurveyData {
    private Integer id;
    private String name;
    private String description;
    private int questionTypeId;
    private String questionType;
    private int questionId;
    private String question;
    private int answerId;
    private String answer;
}
