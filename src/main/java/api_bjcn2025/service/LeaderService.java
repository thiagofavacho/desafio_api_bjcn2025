package api_bjcn2025.service;

import api_bjcn2025.domain.model.Leader;
import org.springframework.stereotype.Service;

public interface LeaderService {

    Leader findById(Long id);

    Leader create(Leader leaderToCreate);

}
