package com.gabn.survey.survey.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurveyAnswerDTOTest {
    private SurveyAnswerDTO surveyAnswerDTO1;
    private SurveyAnswerDTO surveyAnswerDTO2;

    @BeforeEach
    void setUp() {
        surveyAnswerDTO1 = new SurveyAnswerDTO();
        surveyAnswerDTO2 = new SurveyAnswerDTO(1, 1, 2, 3, "answerText", 1);
    }

    @Test
    void getId() {
        surveyAnswerDTO1.getId();
    }

    @Test
    void getSurvey() {
        surveyAnswerDTO1.getSurvey();
    }

    @Test
    void getQuestion() {
        surveyAnswerDTO1.getQuestion();
    }

    @Test
    void getAnswer() {
        surveyAnswerDTO1.getAnswer();
    }

    @Test
    void getAnswerText() {
        surveyAnswerDTO1.getAnswerText();
    }

    @Test
    void getUserId() {
        surveyAnswerDTO1.getUserId();
    }

    @Test
    void setId() {
        surveyAnswerDTO1.setId(1);
    }

    @Test
    void setSurvey() {
        surveyAnswerDTO1.setSurvey(1);
    }

    @Test
    void setQuestion() {
        surveyAnswerDTO1.setQuestion(1);
    }

    @Test
    void setAnswer() {
        surveyAnswerDTO1.setAnswer(1);
    }

    @Test
    void setAnswerText() {
        surveyAnswerDTO1.setAnswerText("answer text");
    }

    @Test
    void setUserId() {
        surveyAnswerDTO1.setUserId(1);
    }
}