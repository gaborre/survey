package com.gabn.survey.survey.controllers;

import com.gabn.survey.survey.dto.CustomSurveyDTO;
import com.gabn.survey.survey.entities.CustomSurveyData;
import com.gabn.survey.survey.mappers.ICustomSurveyMapper;
import com.gabn.survey.survey.repositories.ICustomSurveyRepository;
import com.gabn.survey.survey.services.impl.CustomSurveyServiceImpl;
import com.gabn.survey.survey.usecases.CustomSurveyUseCase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebFluxTest(CustomSurveyController.class)
public class CustomSurveyControllerTest {
    @Autowired
    private WebTestClient testClient;
    @MockBean
    private CustomSurveyUseCase useCase;
    @Mock
    private CustomSurveyServiceImpl service;
    @Mock
    private ICustomSurveyMapper mapper;
    @Mock
    private ICustomSurveyRepository repository;
    private List<CustomSurveyData> customSurveyList;
    private List<CustomSurveyDTO> customSurveyDTOList;
    private Flux<CustomSurveyData> customSurveyData;
    private Flux<CustomSurveyDTO> customSurveyDTO;

    @BeforeEach
    public void setUp() throws Exception {
        customSurveyList = new ArrayList<>();
        customSurveyDTOList = new ArrayList<>();
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
        // DTOs:
        customSurveyDTOList.add(
                new CustomSurveyDTO(
                        1, "survey name", "survey description", 2,
                        "MULTIPLE", 1, "1 question", 1, "1 answer"));
        customSurveyDTOList.add(
                new CustomSurveyDTO(
                        1, "survey name", "survey description", 2,
                        "MULTIPLE", 1, "1 question", 2, "2 answer"));
        customSurveyDTOList.add(
                new CustomSurveyDTO(
                        1, "survey name", "survey description", 1,
                        "OPEN", 2, "2 question", 9, "ABIERTA"));
        customSurveyData = Flux.fromIterable(customSurveyList);
        customSurveyDTO = Flux.fromIterable(customSurveyDTOList);
    }

    @Test
    public void get_custom_survey_by_id() {
        testClient.get()
                .uri("/api/v1/custom-survey/{id}", "1")
                .accept(MediaType.TEXT_EVENT_STREAM)
                .exchange()
                .expectStatus().isOk();
    }
}