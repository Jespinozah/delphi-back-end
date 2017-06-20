package survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import survey.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
}
