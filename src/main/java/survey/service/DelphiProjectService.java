package survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import survey.dto.DelphiProjectDto;
import survey.mapper.ManagementMapper;
import survey.model.DelphiProject;
import survey.repository.DelphiProjectRepository;

import java.util.List;


@Service
public class DelphiProjectService {

    @Autowired
    private ManagementMapper managementMapper;

    @Autowired
    private DelphiProjectRepository delphiProjectRepository;

    public List<DelphiProjectDto> getAllDelphiProjects() {
        List<DelphiProject> delphiProjectList = delphiProjectRepository.findAll();
        return managementMapper.convertDelphiProjectListToDelphiProjectDTOList(delphiProjectList);
    }

    public void addDelphiProject(DelphiProject delphiProject) {
        delphiProjectRepository.saveAndFlush(delphiProject);
    }

    public DelphiProjectDto getDelphiProject(int id) {
        DelphiProject delphiProject = delphiProjectRepository.findOne(id);
        return managementMapper.convertDelphiProjectToDelphiProjectDto(delphiProject);
    }

    public void updateDelphiProject(DelphiProject delphiProject) {
        delphiProjectRepository.save(delphiProject);
    }

    public void deleteDelphiProject(int id) {
        delphiProjectRepository.delete(id);
    }
}
