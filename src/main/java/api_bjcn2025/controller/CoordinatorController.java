package api_bjcn2025.controller;

import api_bjcn2025.domain.model.Coordinator;
import api_bjcn2025.service.CoordinatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/coordinators")
public class CoordinatorController {

    @Autowired
    private final CoordinatorService coordinatorService;

    public CoordinatorController(CoordinatorService coordinatorService) {
        this.coordinatorService = coordinatorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coordinator> findById(@PathVariable Long id) {
        var coordinator = coordinatorService.findById(id);
        return ResponseEntity.ok(coordinator);
    }

    @PostMapping
    public ResponseEntity<Coordinator> create(@RequestBody Coordinator coordinatorToCreated) {
        var coordinatorCreated = coordinatorService.create(coordinatorToCreated);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(coordinatorCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(coordinatorCreated);
    }
}
