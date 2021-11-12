package com.gabn.survey.survey.usecases;

import com.gabn.survey.survey.dto.SurveyAnswerDTO;
import com.gabn.survey.survey.mappers.ISurveyAnswerMapper;
import com.gabn.survey.survey.services.SurveyAnswerService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
@NoArgsConstructor
public class SurveyAnswerUseCase {
    @Autowired
    private SurveyAnswerService service;
    @Autowired
    private ISurveyAnswerMapper mapper;

    public Flux<SurveyAnswerDTO> saveSurvey(List<SurveyAnswerDTO> surveyAnswerDTO) {
        return service.save(mapper.toModel(surveyAnswerDTO))
                .map(surveyAnswerData -> mapper.toDTO(surveyAnswerData));
    }
}
