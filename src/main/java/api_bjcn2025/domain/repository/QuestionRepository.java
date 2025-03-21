package api_bjcn2025.domain.repository;

import api_bjcn2025.domain.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
