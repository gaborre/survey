package com.gabn.survey.survey.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSurveyDTOTest {
    private CustomSurveyDTO customSurvey1;
    private CustomSurveyDTO customSurvey2;
    @BeforeEach
    void setUp() {
        customSurvey1 = new CustomSurveyDTO();
        customSurvey2 = new CustomSurveyDTO(
                1, "name", "description",
                1, "questionType",
                1, "question", 2, "answer");
    }

    @Test
    void getId() {
        customSurvey1.getId();
    }

    @Test
    void getName() {
        customSurvey1.getName();
    }

    @Test
    void getDescription() {
        customSurvey1.getDescription();
    }

    @Test
    void getQuestionTypeId() {
        customSurvey1.getQuestionTypeId();
    }

    @Test
    void getQuestionType() {
        customSurvey1.getQuestionType();
    }

    @Test
    void getQuestionId() {
        customSurvey1.getQuestionId();
    }

    @Test
    void getQuestion() {
        customSurvey1.getQuestion();
    }

    @Test
    void getAnswerId() {
        customSurvey1.getAnswerId();
    }

    @Test
    void getAnswer() {
        customSurvey1.getAnswer();
    }

    @Test
    void setId() {
        customSurvey1.setId(1);
    }

    @Test
    void setName() {
        customSurvey1.setName("name");
    }

    @Test
    void setDescription() {
        customSurvey1.setDescription("description");
    }

    @Test
    void setQuestionTypeId() {
        customSurvey1.setQuestionTypeId(1);
    }

    @Test
    void setQuestionType() {
        customSurvey1.setQuestionType("questionType");
    }

    @Test
    void setQuestionId() {
        customSurvey1.setQuestionId(1);
    }

    @Test
    void setQuestion() {
        customSurvey1.setQuestion("question");
    }

    @Test
    void setAnswerId() {
        customSurvey1.setAnswerId(1);
    }

    @Test
    void setAnswer() {
        customSurvey1.setAnswer("answer");
    }
}