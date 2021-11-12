package com.gabn.survey.survey.controllers;

import com.gabn.survey.survey.dto.SurveyAnswerDTO;
import com.gabn.survey.survey.mappers.ISurveyAnswerMapper;
import com.gabn.survey.survey.repositories.ISurveyAnswerRepository;
import com.gabn.survey.survey.services.impl.SurveyAnswerServiceImpl;
import com.gabn.survey.survey.usecases.SurveyAnswerUseCase;
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

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebFluxTest(SurveyAnswerController.class)
public class SurveyAnswerControllerTest {
    @Autowired
    private WebTestClient testClient;
    @MockBean
    private SurveyAnswerUseCase useCase;
    @Mock
    private SurveyAnswerServiceImpl service;
    @Mock
    private ISurveyAnswerRepository repository;
    @Mock
    private ISurveyAnswerMapper mapper;
    private List<SurveyAnswerDTO> surveyAnswerDTO;

    @BeforeEach
    public void setUp() throws Exception {
        Integer id = null;
        surveyAnswerDTO = new ArrayList<>();
        surveyAnswerDTO.add(new SurveyAnswerDTO(id, 1, 1, 2, "", 1));
        surveyAnswerDTO.add(new SurveyAnswerDTO(id, 1, 2, 4, "", 1));
        surveyAnswerDTO.add(new SurveyAnswerDTO(id, 1, 3, 9, "abierta1, abierta2", 1));
        surveyAnswerDTO.add(new SurveyAnswerDTO(id, 1, 4, 9, "text1, text2, text3", 1));
    }

    @Test
    public void save_survey() {
        testClient.post()
                .uri("/api/v1/survey-answer")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.TEXT_EVENT_STREAM)
                .body(Flux.fromIterable(surveyAnswerDTO), List.class)
                .exchange()
                .expectStatus().isOk();
    }
}