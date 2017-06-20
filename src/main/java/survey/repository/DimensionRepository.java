package survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import survey.model.Dimension;

public interface DimensionRepository extends JpaRepository<Dimension, Integer> {
}
