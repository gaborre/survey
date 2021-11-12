package com.gabn.survey.survey.usecases;

import com.gabn.survey.survey.dto.CustomSurveyDTO;
import com.gabn.survey.survey.mappers.ICustomSurveyMapper;
import com.gabn.survey.survey.services.CustomSurveyService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@NoArgsConstructor
public class CustomSurveyUseCase {
    @Autowired
    private CustomSurveyService service;
    @Autowired
    private ICustomSurveyMapper mapper;

    public Flux<CustomSurveyDTO> getCustomSurveyById(int id) {
        return service.getCustomSurveyById(id)
                .map(surveyData -> mapper.toDTO(surveyData));
    }
}
