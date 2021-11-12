package com.gabn.survey.survey.controllers;

import com.gabn.survey.survey.dto.CustomSurveyDTO;
import com.gabn.survey.survey.usecases.CustomSurveyUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1")
public class CustomSurveyController {
    @Autowired
    private CustomSurveyUseCase useCase;


    @GetMapping(value = "/custom-survey/{id}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<CustomSurveyDTO> getCustomSurveyById(@PathVariable("id") int id) {
        return useCase.getCustomSurveyById(id);
    }
}
