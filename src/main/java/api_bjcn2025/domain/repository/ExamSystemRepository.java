package api_bjcn2025.domain.repository;

import api_bjcn2025.domain.model.ExamSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamSystemRepository extends JpaRepository<ExamSystem, Long> {
}
