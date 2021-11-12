package com.gabn.survey.survey.controllers;

import com.gabn.survey.survey.dto.SurveyAnswerDTO;
import com.gabn.survey.survey.usecases.SurveyAnswerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SurveyAnswerController {
    @Autowired
    private SurveyAnswerUseCase useCase;

    @PostMapping(value = "/survey-answer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<SurveyAnswerDTO> saveSurvey(@RequestBody List<SurveyAnswerDTO> surveyAnswerDTO) {
        return useCase.saveSurvey(surveyAnswerDTO);
    }
}
