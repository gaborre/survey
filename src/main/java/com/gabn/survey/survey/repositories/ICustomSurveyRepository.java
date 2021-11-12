package com.gabn.survey.survey.repositories;

import com.gabn.survey.survey.entities.CustomSurveyData;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ICustomSurveyRepository extends R2dbcRepository<CustomSurveyData, Integer> {
    String GET_CUSTOM_SURVEY_BY_ID_QUERY = "SELECT s.id, s.name, s.description,\n" +
            "\tqt.id as question_type_id, qt.description as question_type,\n" +
            "\tq.id as question_id, q.description as question,\n" +
            "\ta.id as answer_id, a.description as answer\n" +
            "FROM survey_question sq\n" +
            "INNER JOIN survey s on s.id = sq.survey\n" +
            "INNER JOIN question q on q.id = sq.question\n" +
            "INNER JOIN question_type qt on qt.id = q.question_type\n" +
            "INNER JOIN answer a on a.id = sq.answer\n" +
            "WHERE s.id = $1 \n" +
            "ORDER BY s.id, q.id, a.id";

    @Query(GET_CUSTOM_SURVEY_BY_ID_QUERY)
    Flux<CustomSurveyData> getCustomSurveyById(int id);
}
