package api_bjcn2025.service.impl;

import api_bjcn2025.domain.model.Coordinator;
import api_bjcn2025.domain.repository.CoordinatorRepository;
import api_bjcn2025.service.CoordinatorService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CoordinatorServiceImpl implements CoordinatorService {

    private final CoordinatorRepository coordinatorRepository;

    public CoordinatorServiceImpl(CoordinatorRepository coordinatorRepository) {
        this.coordinatorRepository = coordinatorRepository;
    }

    @Override
    public Coordinator findById(Long id) {
        return coordinatorRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Coordinator create(Coordinator coordinatorToCreate) {
        if (coordinatorToCreate.getId() != null && coordinatorRepository.existsById(coordinatorToCreate.getId())) {
            throw new IllegalArgumentException("This Leader already exists.");
        }
        return coordinatorRepository.save(coordinatorToCreate);
    }
}
