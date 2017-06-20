package survey.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Dimension {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_delphi_project")
    private DelphiProject delphiProject;

    @OneToMany(targetEntity = Driver.class, mappedBy = "dimension",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Driver> drivers;

    public Dimension() {
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

    public DelphiProject getDelphiProject() {
        return delphiProject;
    }

    public void setDelphiProject(DelphiProject delphiProject) {
        this.delphiProject = delphiProject;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
}
