package api_bjcn2025.service;

import api_bjcn2025.domain.model.Answer;

public interface AnswerService {

    Answer findById(Long id);

    Answer create(Answer answerToCreate);
}
