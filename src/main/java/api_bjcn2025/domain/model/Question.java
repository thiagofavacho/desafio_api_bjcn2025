package api_bjcn2025.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private List<String> alternatives;
    private int correctAlternative;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(List<String> alternatives) {
        this.alternatives = alternatives;
    }

    public int getCorrectAlternative() {
        return correctAlternative;
    }

    public void setCorrectAlternative(int correctAlternative) {
        this.correctAlternative = correctAlternative;
    }
}
