package survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import survey.model.DelphiProject;

public interface DelphiProjectRepository extends JpaRepository<DelphiProject, Integer>  {

}
