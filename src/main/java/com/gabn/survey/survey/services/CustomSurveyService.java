package com.gabn.survey.survey.services;

import com.gabn.survey.survey.entities.CustomSurveyData;
import reactor.core.publisher.Flux;

public interface CustomSurveyService {

    Flux<CustomSurveyData> getCustomSurveyById(int id);
}
