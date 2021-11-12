package com.gabn.survey.survey.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurveyAnswerDataTest {
    private SurveyAnswerData surveyAnswerData1;
    private SurveyAnswerData surveyAnswerData2;

    @BeforeEach
    void setUp() {
        surveyAnswerData1 = new SurveyAnswerData();
        surveyAnswerData2 = new SurveyAnswerData(1, 1, 2, 3, "answerText", 1);
    }

    @Test
    void getId() {
        surveyAnswerData1.getId();
    }

    @Test
    void getSurvey() {
        surveyAnswerData1.getSurvey();
    }

    @Test
    void getQuestion() {
        surveyAnswerData1.getQuestion();
    }

    @Test
    void getAnswer() {
        surveyAnswerData1.getAnswer();
    }

    @Test
    void getAnswerText() {
        surveyAnswerData1.getAnswerText();
    }

    @Test
    void getUserId() {
        surveyAnswerData1.getUserId();
    }

    @Test
    void setId() {
        surveyAnswerData1.setId(1);
    }

    @Test
    void setSurvey() {
        surveyAnswerData1.setSurvey(1);
    }

    @Test
    void setQuestion() {
        surveyAnswerData1.setQuestion(1);
    }

    @Test
    void setAnswer() {
        surveyAnswerData1.setAnswer(1);
    }

    @Test
    void setAnswerText() {
        surveyAnswerData1.setAnswerText("answer text");
    }

    @Test
    void setUserId() {
        surveyAnswerData1.setUserId(1);
    }
}