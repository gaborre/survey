package com.gabn.survey.survey.mappers;

import com.gabn.survey.survey.dto.CustomSurveyDTO;
import com.gabn.survey.survey.entities.CustomSurveyData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomSurveyMapper {
    CustomSurveyDTO toDTO(CustomSurveyData customSurveyData);
}
