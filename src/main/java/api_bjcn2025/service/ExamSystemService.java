package api_bjcn2025.service;

import api_bjcn2025.domain.model.Coordinator;
import api_bjcn2025.domain.model.ExamSystem;
import api_bjcn2025.domain.repository.ExamSystemRepository;

public interface ExamSystemService {

    ExamSystem findById(Long id);

    ExamSystemRepository create(ExamSystem ExamSystemToCreate);
}
