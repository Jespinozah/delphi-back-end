package survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import survey.model.Driver;
import survey.repository.DimensionRepository;
import survey.repository.DriverRepository;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private DimensionRepository dimensionRepository;

    public List<Driver> getAllDriver() {
        return driverRepository.findAll();
    }

    public void addDriver(Driver driver) {
        driver.setDimension(dimensionRepository.findOne(driver.getDimensionId()));
        driverRepository.saveAndFlush(driver);
    }

    public Driver getDriver(int id) {
        return driverRepository.findOne(id);
    }

    public void updateDriver(Driver driver, int id) {
        driverRepository.save(driver);
    }

    public void deleteDriver(int id) {
        driverRepository.delete(id);
    }

}
