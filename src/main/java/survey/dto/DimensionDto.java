package survey.dto;


import java.util.List;

public class DimensionDto {
    private int id;
    private String name;

    private transient int delphiProjectId;

    private DelphiProjectDto delphiProject;

    private List<DriverDto> drivers;

    public DimensionDto() {
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

    public DelphiProjectDto getDelphiProject() {
        return delphiProject;
    }

    public void setDelphiProject(DelphiProjectDto delphiProject) {
        this.delphiProject = delphiProject;
    }

    public List<DriverDto> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<DriverDto> drivers) {
        this.drivers = drivers;
    }

    public int getDelphiProjectId() {
        return delphiProjectId;
    }

    public void setDelphiProjectId(int delphiProjectId) {
        this.delphiProjectId = delphiProjectId;
    }
}
