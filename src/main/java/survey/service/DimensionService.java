package survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import survey.dto.DimensionDto;
import survey.mapper.ManagementMapper;
import survey.model.Dimension;
import survey.repository.DelphiProjectRepository;
import survey.repository.DimensionRepository;

import java.util.List;

@Service
public class DimensionService {

    @Autowired
    private ManagementMapper managementMapper;

    @Autowired
    private DimensionRepository dimensionRepository;

    @Autowired
    private DelphiProjectRepository delphiProjectRepository;

    public List<DimensionDto> getAllDimension() {
        List<Dimension> dimensionList = dimensionRepository.findAll();
        return managementMapper.convertDimensionListToDimensionDTOList(dimensionList);
    }

    public void addDimension(Dimension dimension) {
        dimension.setDelphiProject(delphiProjectRepository.findOne(dimension.getDelphiProjectId()));
        dimensionRepository.saveAndFlush(dimension);
    }

    public DimensionDto getDimension(int id) {
        Dimension dimension = dimensionRepository.findOne(id);
        return managementMapper.convertDimensionToDimensionDto(dimension);
    }

    public void updateDimension(Dimension dimension, int id) {
        dimensionRepository.save(dimension);
    }

    public void deleteDimension(int id) {
        dimensionRepository.delete(id);
    }
}
