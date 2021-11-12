package com.gabn.survey.survey.usecases;

import com.gabn.survey.survey.dto.CustomSurveyDTO;
import com.gabn.survey.survey.dto.SurveyAnswerDTO;
import com.gabn.survey.survey.entities.CustomSurveyData;
import com.gabn.survey.survey.entities.SurveyAnswerData;
import com.gabn.survey.survey.mappers.ICustomSurveyMapper;
import com.gabn.survey.survey.mappers.ISurveyAnswerMapper;
import com.gabn.survey.survey.model.CustomSurvey;
import com.gabn.survey.survey.model.SurveyAnswer;
import com.gabn.survey.survey.repositories.ICustomSurveyRepository;
import com.gabn.survey.survey.repositories.ISurveyAnswerRepository;
import com.gabn.survey.survey.services.impl.CustomSurveyServiceImpl;
import com.gabn.survey.survey.services.impl.SurveyAnswerServiceImpl;
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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebFluxTest(SurveyAnswerUseCase.class)
class SurveyAnswerUseCaseTest {
    @Autowired
    private SurveyAnswerUseCase useCase;
    @MockBean
    private SurveyAnswerServiceImpl service;
    @MockBean
    private ISurveyAnswerMapper mapper;
    @MockBean
    private ISurveyAnswerRepository repository;
    private List<SurveyAnswer> surveyAnswerList;
    private List<SurveyAnswerDTO> surveyAnswerDTOList;
    private List<SurveyAnswerData> surveyAnswerDataList;
    private Flux<SurveyAnswer> surveyAnswer;
    private Flux<SurveyAnswerDTO> surveyAnswerDTO;
    private Flux<SurveyAnswerData> surveyAnswerData;

    @BeforeEach
    void setUp() {
        Integer id = null;
        surveyAnswerDTOList = new ArrayList<>();
        surveyAnswerList = new ArrayList<>();
        surveyAnswerDataList = new ArrayList<>();

        surveyAnswerDTOList.add(new SurveyAnswerDTO(id, 1, 1, 2, "", 1));
        surveyAnswerDTOList.add(new SurveyAnswerDTO(id, 1, 2, 4, "", 1));
        surveyAnswerDTOList.add(new SurveyAnswerDTO(id, 1, 3, 9, "abierta1, abierta2", 1));
        surveyAnswerDTOList.add(new SurveyAnswerDTO(id, 1, 4, 9, "text1, text2, text3", 1));

        surveyAnswerList.add(new SurveyAnswer(id, 1, 1, 2, "", 1));
        surveyAnswerList.add(new SurveyAnswer(id, 1, 2, 4, "", 1));
        surveyAnswerList.add(new SurveyAnswer(id, 1, 3, 9, "abierta1, abierta2", 1));
        surveyAnswerList.add(new SurveyAnswer(id, 1, 4, 9, "text1, text2, text3", 1));

        surveyAnswerDataList.add(new SurveyAnswerData(id, 1, 1, 2, "", 1));
        surveyAnswerDataList.add(new SurveyAnswerData(id, 1, 2, 4, "", 1));
        surveyAnswerDataList.add(new SurveyAnswerData(id, 1, 3, 9, "abierta1, abierta2", 1));
        surveyAnswerDataList.add(new SurveyAnswerData(id, 1, 4, 9, "text1, text2, text3", 1));

        surveyAnswerDTO = Flux.fromIterable(surveyAnswerDTOList);
        surveyAnswer = Flux.fromIterable(surveyAnswerList);
        surveyAnswerData = Flux.fromIterable(surveyAnswerDataList);

    }

    @Test
    void save_survey() {
        when(service.save(any())).thenReturn(surveyAnswerData);
        useCase.saveSurvey(surveyAnswerDTOList);
    }
}