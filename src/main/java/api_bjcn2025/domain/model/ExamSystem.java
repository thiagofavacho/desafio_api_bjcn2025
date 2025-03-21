package api_bjcn2025.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_exam_system")
public class ExamSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Coordinator> coordinators;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Leader> leaders;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Test> tests;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Result> results;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Coordinator> getCoordinators() {
        return coordinators;
    }

    public void setCoordinators(List<Coordinator> coordinators) {
        this.coordinators = coordinators;
    }

    public List<Leader> getLeaders() {
        return leaders;
    }

    public void setLeaders(List<Leader> leaders) {
        this.leaders = leaders;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}