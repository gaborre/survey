package com.gabn.survey.survey.usecases;

import com.gabn.survey.survey.entities.CustomSurveyData;
import com.gabn.survey.survey.mappers.ICustomSurveyMapper;
import com.gabn.survey.survey.repositories.ICustomSurveyRepository;
import com.gabn.survey.survey.services.impl.CustomSurveyServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebFluxTest(CustomSurveyUseCase.class)
public class CustomSurveyUseCaseTest {
    @Autowired
    private CustomSurveyUseCase useCase;
    @MockBean
    private CustomSurveyServiceImpl service;
    @MockBean
    private ICustomSurveyMapper mapper;
    @MockBean
    private ICustomSurveyRepository repository;
    private List<CustomSurveyData> customSurveyList;
    private Flux<CustomSurveyData> customSurveyData;

    @BeforeEach
    public void setUp() throws Exception {
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
        customSurveyData = Flux.fromIterable(customSurveyList);
    }

    @Test
    public void get_custom_survey_by_id() {
        when(service.getCustomSurveyById(anyInt())).thenReturn(customSurveyData);
        useCase.getCustomSurveyById(1);
    }
}