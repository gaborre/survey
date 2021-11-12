package com.gabn.survey.survey.services.impl;

import com.gabn.survey.survey.entities.SurveyAnswerData;
import com.gabn.survey.survey.mappers.ISurveyAnswerMapper;
import com.gabn.survey.survey.model.SurveyAnswer;
import com.gabn.survey.survey.repositories.ISurveyAnswerRepository;
import com.gabn.survey.survey.services.SurveyAnswerService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
@NoArgsConstructor
public class SurveyAnswerServiceImpl implements SurveyAnswerService {
    @Autowired
    private ISurveyAnswerRepository repository;
    @Autowired
    private ISurveyAnswerMapper mapper;

    @Override
    public Flux<SurveyAnswerData> save(List<SurveyAnswer> surveyAnswer) {
        return repository.saveAll(mapper.toData(surveyAnswer));
    }
}
