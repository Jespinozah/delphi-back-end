package survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import survey.dto.DriverDto;
import survey.model.Driver;
import survey.service.DriverService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class DriverController {
    
    @Autowired
    private DriverService driverService;

    @RequestMapping("/drivers")
    public List<DriverDto> getAllDrivers() {
        return driverService.getAllDriver();
    }

    @RequestMapping("/drivers/{id}")
    public Driver getDriver(@PathVariable int id) {
        return driverService.getDriver(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/drivers")
    public void addDriver(@RequestBody Driver driver) {
        driverService.addDriver(driver);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/drivers/{id}")
    public void updateDriver(@RequestBody Driver driver, @PathVariable int id) {
        driverService.updateDriver(driver, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/drivers/{id}")
    public void deleteDriver(@PathVariable int id) {
        driverService.deleteDriver(id);
    }
}
