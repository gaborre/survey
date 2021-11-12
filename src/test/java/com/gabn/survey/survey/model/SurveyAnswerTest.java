package com.gabn.survey.survey.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurveyAnswerTest {
    private SurveyAnswer surveyAnswer1;
    private SurveyAnswer surveyAnswer2;

    @BeforeEach
    void setUp() {
        surveyAnswer1 = new SurveyAnswer();
        surveyAnswer2 = new SurveyAnswer(1, 1, 2, 3, "answerText", 1);
    }

    @Test
    void getId() {
        surveyAnswer1.getId();
    }

    @Test
    void getSurvey() {
        surveyAnswer1.getSurvey();
    }

    @Test
    void getQuestion() {
        surveyAnswer1.getQuestion();
    }

    @Test
    void getAnswer() {
        surveyAnswer1.getAnswer();
    }

    @Test
    void getAnswerText() {
        surveyAnswer1.getAnswerText();
    }

    @Test
    void getUserId() {
        surveyAnswer1.getUserId();
    }

    @Test
    void setId() {
        surveyAnswer1.setId(1);
    }

    @Test
    void setSurvey() {
        surveyAnswer1.setSurvey(1);
    }

    @Test
    void setQuestion() {
        surveyAnswer1.setQuestion(1);
    }

    @Test
    void setAnswer() {
        surveyAnswer1.setAnswer(1);
    }

    @Test
    void setAnswerText() {
        surveyAnswer1.setAnswerText("answer text");
    }

    @Test
    void setUserId() {
        surveyAnswer1.setUserId(1);
    }
}