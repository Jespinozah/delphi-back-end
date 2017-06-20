package survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import survey.model.DelphiProject;
import survey.repository.DelphiProjectRepository;

import java.util.List;


@Service
public class DelphiProjectService {

    @Autowired
    private DelphiProjectRepository delphiProjectRepository;

    public List<DelphiProject> getAllDelphiProjects() {
        return delphiProjectRepository.findAll();
    }

    public void addDelphiProject(DelphiProject delphiProject) {
        delphiProjectRepository.saveAndFlush(delphiProject);
    }

    public DelphiProject getDelphiProject(int id) {
        return delphiProjectRepository.findOne(id);
    }

    public void updateDelphiProject(DelphiProject delphiProject) {
        delphiProjectRepository.save(delphiProject);
    }

    public void deleteDelphiProject(int id) {
        delphiProjectRepository.delete(id);
    }
}
