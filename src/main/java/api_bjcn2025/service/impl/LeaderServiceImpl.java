package api_bjcn2025.service.impl;

import api_bjcn2025.domain.model.Leader;
import api_bjcn2025.domain.repository.LeaderRepository;
import api_bjcn2025.service.LeaderService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LeaderServiceImpl implements LeaderService {

    private final LeaderRepository leaderRepository;

    public LeaderServiceImpl(LeaderRepository leaderRepository) {
        this.leaderRepository = leaderRepository;
    }

    @Override
    public Leader findById(Long id) {
        return leaderRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Leader create(Leader leaderToCreate) {
        if (leaderToCreate.getId() != null && leaderRepository.existsById(leaderToCreate.getId())) {
            throw new IllegalArgumentException("This Leader already exists.");
        }
        return leaderRepository.save(leaderToCreate);
    }
}
