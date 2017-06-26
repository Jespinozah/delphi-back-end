package survey.mapper;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;
import survey.dto.DelphiProjectDto;
import survey.dto.DimensionDto;
import survey.dto.DriverDto;
import survey.model.DelphiProject;
import survey.model.Dimension;
import survey.model.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class ManagementMapper {
    private static final List<String> MAPPER_FILE = Arrays.asList("dozerMapping.xml");

    public DriverDto convertDriverToDriverDto(Driver driver) {
        Mapper mapper = new DozerBeanMapper(MAPPER_FILE);
        return mapper.map(driver, DriverDto.class, "driverToDriverDTO");
    }

    public List<DriverDto> convertDriverListToDriverDTOList(List<Driver> driverList) {
        List<DriverDto> driverDtoList = new ArrayList<>();
            Mapper mapper = new DozerBeanMapper(MAPPER_FILE);
            for (Driver driver : driverList) {
                driverDtoList.add(mapper.map(driver, DriverDto.class, "driverToDriverDTO"));
            }
        return driverDtoList;
    }

    public DimensionDto convertDimensionToDimensionDto(Dimension dimension) {
        Mapper mapper = new DozerBeanMapper(MAPPER_FILE);
        return mapper.map(dimension, DimensionDto.class, "dimensionToDimensionDTO");
    }

    public List<DimensionDto> convertDimensionListToDimensionDTOList(List<Dimension> dimensionList) {
        List<DimensionDto> dimensionDtoList = new ArrayList<>();
        Mapper mapper = new DozerBeanMapper(MAPPER_FILE);
        for (Dimension dimension : dimensionList) {
            dimensionDtoList.add(mapper.map(dimension, DimensionDto.class, "dimensionToDimensionDTO"));
        }
        return dimensionDtoList;
    }

    public DelphiProjectDto convertDelphiProjectToDelphiProjectDto(DelphiProject delphiProject) {
        Mapper mapper = new DozerBeanMapper(MAPPER_FILE);
        return mapper.map(delphiProject, DelphiProjectDto.class, "delphiProjectToDelphiProjectDTO");
    }

    public List<DelphiProjectDto> convertDelphiProjectListToDelphiProjectDTOList(List<DelphiProject> delphiProjectList) {
        List<DelphiProjectDto> delphiProjectDtoList = new ArrayList<>();
        Mapper mapper = new DozerBeanMapper(MAPPER_FILE);
        for (DelphiProject delphiProject : delphiProjectList) {
            delphiProjectDtoList.add(mapper.map(delphiProject, DelphiProjectDto.class, "delphiProjectToDelphiProjectDTO"));
        }
        return delphiProjectDtoList;
    }

}
