package com.gabn.survey.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomSurveyDTO  implements Serializable {
    private int id;
    private String name;
    private String description;
    private int questionTypeId;
    private String questionType;
    private int questionId;
    private String question;
    private int answerId;
    private String answer;
}
