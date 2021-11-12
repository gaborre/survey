package com.gabn.survey.survey.services;

import com.gabn.survey.survey.entities.SurveyAnswerData;
import com.gabn.survey.survey.model.SurveyAnswer;
import reactor.core.publisher.Flux;

import java.util.List;

public interface SurveyAnswerService {
    Flux<SurveyAnswerData> save(List<SurveyAnswer> surveyAnswerList);
}
