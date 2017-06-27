package survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import survey.dto.DriverDto;
import survey.mapper.ManagementMapper;
import survey.model.Driver;
import survey.repository.DimensionRepository;
import survey.repository.DriverRepository;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private ManagementMapper managementMapper;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private DimensionRepository dimensionRepository;

    public List<DriverDto> getAllDriver() {
        List<Driver> driverList = driverRepository.findAll();
        return managementMapper.convertDriverListToDriverDTOList(driverList);
    }

    public void addDriver(Driver driver) {
        driver.setDimension(dimensionRepository.findOne(driver.getDimensionId()));
        driverRepository.saveAndFlush(driver);
    }

    public DriverDto getDriver(int id) {
        Driver driver = driverRepository.findOne(id);
        return managementMapper.convertDriverToDriverDto(driver);
    }

    public void updateDriver(Driver driver, int id) {
        driverRepository.save(driver);
    }

    public void deleteDriver(int id) {
        driverRepository.delete(id);
    }

}
