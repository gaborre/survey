package com.gabn.survey.survey.services.impl;

import com.gabn.survey.survey.entities.CustomSurveyData;
import com.gabn.survey.survey.repositories.ICustomSurveyRepository;
import com.gabn.survey.survey.services.CustomSurveyService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@NoArgsConstructor
public class CustomSurveyServiceImpl implements CustomSurveyService {
    @Autowired
    private ICustomSurveyRepository repository;

    @Override
    public Flux<CustomSurveyData> getCustomSurveyById(int id) {
        return repository.getCustomSurveyById(id);
    }
}
