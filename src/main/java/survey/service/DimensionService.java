package survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import survey.model.Dimension;
import survey.repository.DelphiProjectRepository;
import survey.repository.DimensionRepository;

import java.util.List;

@Service
public class DimensionService {

    @Autowired
    private DimensionRepository dimensionRepository;

    @Autowired
    private DelphiProjectRepository delphiProjectRepository;

    public List<Dimension> getAllDimension() {
        return dimensionRepository.findAll();
    }

    public void addDimension(Dimension dimension) {
        dimension.setDelphiProject(delphiProjectRepository.findOne(dimension.getDelphiProjectId()));
        dimensionRepository.saveAndFlush(dimension);
    }

    public Dimension getDimension(int id) {
        return dimensionRepository.findOne(id);
    }

    public void updateDimension(Dimension dimension, int id) {
        dimensionRepository.save(dimension);
    }

    public void deleteDimension(int id) {
        dimensionRepository.delete(id);
    }
}
