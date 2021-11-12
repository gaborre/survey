package com.gabn.survey.survey.services.impl;

import com.gabn.survey.survey.entities.CustomSurveyData;
import com.gabn.survey.survey.repositories.ICustomSurveyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebFluxTest(CustomSurveyServiceImpl.class)
class CustomSurveyServiceImplTest {
    @Autowired
    private CustomSurveyServiceImpl service;
    @MockBean
    private ICustomSurveyRepository repository;
    private List<CustomSurveyData> customSurveyList;

    @BeforeEach
    void setUp() {
        customSurveyList = new ArrayList<>();
        customSurveyList.add(
                new CustomSurveyData(
                        1, "survey name", "survey description", 2,
                        "MULTIPLE", 1, "1 question", 1, "1 answer"));
        customSurveyList.add(
                new CustomSurveyData(
                        1, "survey name", "survey description", 2,
                        "MULTIPLE", 1, "1 question", 2, "2 answer"));
        customSurveyList.add(
                new CustomSurveyData(
                        1, "survey name", "survey description", 1,
                        "OPEN", 2, "2 question", 9, "ABIERTA"));
    }

    @Test
    void get_custom_survey_by_id() {
        service.getCustomSurveyById(1);
    }
}