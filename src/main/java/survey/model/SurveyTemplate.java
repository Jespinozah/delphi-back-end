package survey.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class SurveyTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String indicaciones;
    private boolean status;
    private Date startDate;
    private Date endDate;

    @OneToMany(targetEntity = SurveyDriverTemplate.class, mappedBy = "surveyTemplate",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SurveyDriverTemplate> surveyDriverTemplates;

    public SurveyTemplate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<SurveyDriverTemplate> getSurveyDriverTemplates() {
        return surveyDriverTemplates;
    }

    public void setSurveyDriverTemplates(List<SurveyDriverTemplate> surveyDriverTemplates) {
        this.surveyDriverTemplates = surveyDriverTemplates;
    }
}
