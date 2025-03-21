package api_bjcn2025.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    private String answeredQuestion;
    private int selectedAlternative;
    private int correctAlternative;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getAnsweredQuestion() {
        return answeredQuestion;
    }

    public void setAnsweredQuestion(String answeredQuestion) {
        this.answeredQuestion = answeredQuestion;
    }

    public int getSelectedAlternative() {
        return selectedAlternative;
    }

    public void setSelectedAlternative(int selectedAlternative) {
        this.selectedAlternative = selectedAlternative;
    }

    public int getCorrectAlternative() {
        return correctAlternative;
    }

    public void setCorrectAlternative(int correctAlternative) {
        this.correctAlternative = correctAlternative;
    }
}
