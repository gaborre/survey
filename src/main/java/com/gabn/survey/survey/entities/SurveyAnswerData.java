package com.gabn.survey.survey.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("survey_answer")
public class SurveyAnswerData {
    @Id
    private Integer id;
    private int survey;
    private int question;
    private int answer;
    @Column("answer_text")
    private String answerText;
    @Column("user_id")
    private int userId;
}
