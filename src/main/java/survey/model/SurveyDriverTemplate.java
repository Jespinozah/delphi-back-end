package survey.model;

import javax.persistence.*;

@Entity
public class SurveyDriverTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double averageRating;

    @ManyToOne
    @JoinColumn(name = "id_survey_template")
    private SurveyTemplate surveyTemplate;

    public SurveyDriverTemplate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public SurveyTemplate getSurveyTemplate() {
        return surveyTemplate;
    }

    public void setSurveyTemplate(SurveyTemplate surveyTemplate) {
        this.surveyTemplate = surveyTemplate;
    }
}
