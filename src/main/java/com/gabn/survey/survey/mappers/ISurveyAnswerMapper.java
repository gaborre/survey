package com.gabn.survey.survey.mappers;

import com.gabn.survey.survey.dto.SurveyAnswerDTO;
import com.gabn.survey.survey.entities.SurveyAnswerData;
import com.gabn.survey.survey.model.SurveyAnswer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISurveyAnswerMapper {
    SurveyAnswerData toData(SurveyAnswer surveyAnswer);
    List<SurveyAnswerData> toData(List<SurveyAnswer> surveyAnswerList);
    SurveyAnswer toModel(SurveyAnswerData surveyAnswerData);
    SurveyAnswer toModel(SurveyAnswerDTO surveyAnswerDTO);
    List<SurveyAnswer> toModel(List<SurveyAnswerDTO> surveyAnswerDTOList);
    SurveyAnswerDTO toDTO(SurveyAnswerData surveyAnswerData);
}
