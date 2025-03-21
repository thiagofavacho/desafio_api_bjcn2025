package api_bjcn2025.controller;

import api_bjcn2025.domain.model.Leader;
import api_bjcn2025.service.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/leaders")
public class LeaderController {

    @Autowired
    private final LeaderService leaderService;

    public LeaderController(LeaderService leaderService) {
        this.leaderService = leaderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Leader> findById(@PathVariable Long id) {
        var leader = leaderService.findById(id);
        return ResponseEntity.ok(leader);
    }

    @PostMapping
    public ResponseEntity<Leader> create(@RequestBody Leader leaderToCreated) {
        var leaderCreated = leaderService.create(leaderToCreated);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(leaderCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(leaderCreated);
    }
}
