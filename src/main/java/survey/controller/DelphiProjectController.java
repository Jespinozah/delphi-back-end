package survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import survey.dto.DelphiProjectDto;
import survey.model.DelphiProject;
import survey.service.DelphiProjectService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class DelphiProjectController {

    @Autowired
    private DelphiProjectService delphiProjectService;

    @RequestMapping("/projects")
    public List<DelphiProjectDto> getAllDelphiProjects() {
        return delphiProjectService.getAllDelphiProjects();
    }

    @RequestMapping("/projects/{id}")
    public DelphiProject getDelphiProject(@PathVariable int id) {
        return delphiProjectService.getDelphiProject(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    public void addDelphiProject(@RequestBody DelphiProject delphiProject) {
        delphiProjectService.addDelphiProject(delphiProject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/projects/{id}")
    public void updateDelphiProject(@RequestBody DelphiProject delphiProject, @PathVariable int id) {
        delphiProjectService.updateDelphiProject(delphiProject);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{id}")
    public void deleteDelphiProject(@PathVariable int id) {
        delphiProjectService.deleteDelphiProject(id);
    }
}
