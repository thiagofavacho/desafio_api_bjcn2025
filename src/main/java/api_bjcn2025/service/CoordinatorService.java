package api_bjcn2025.service;

import api_bjcn2025.domain.model.Coordinator;
import org.springframework.stereotype.Service;

public interface CoordinatorService {

    Coordinator findById(Long id);

    Coordinator create(Coordinator coordinatorToCreate);
}
