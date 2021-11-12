package com.gabn.survey.survey.repositories;

import com.gabn.survey.survey.entities.SurveyAnswerData;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ISurveyAnswerRepository extends R2dbcRepository<SurveyAnswerData, Integer> {
}
