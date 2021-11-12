package com.gabn.survey.survey.services.impl;

import com.gabn.survey.survey.mappers.ISurveyAnswerMapper;
import com.gabn.survey.survey.model.SurveyAnswer;
import com.gabn.survey.survey.repositories.ISurveyAnswerRepository;
import com.gabn.survey.survey.services.SurveyAnswerService;
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

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebFluxTest(SurveyAnswerServiceImpl.class)
class SurveyAnswerServiceImplTest {
    @Autowired
    private SurveyAnswerService service;
    @MockBean
    private ISurveyAnswerMapper mapper;
    @MockBean
    private ISurveyAnswerRepository repository;
    private List<SurveyAnswer> surveyAnswerList;
    private Flux<SurveyAnswer> surveyAnswer;

    @BeforeEach
    void setUp() {
        Integer id = null;
        surveyAnswerList = new ArrayList<>();
        surveyAnswerList.add(new SurveyAnswer(id, 1, 1, 2, "", 1));
        surveyAnswerList.add(new SurveyAnswer(id, 1, 2, 4, "", 1));
        surveyAnswerList.add(new SurveyAnswer(id, 1, 3, 9, "abierta1, abierta2", 1));
        surveyAnswerList.add(new SurveyAnswer(id, 1, 4, 9, "text1, text2, text3", 1));
        surveyAnswer = Flux.fromIterable(surveyAnswerList);
    }

    @Test
    void save() {
        service.save(surveyAnswerList);
    }
}