package survey.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import survey.model.Dimension;
import survey.service.DimensionService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class DimensionController {

    @Autowired
    private DimensionService dimensionService;

    @RequestMapping("/dimensions")
    public List<Dimension> getAllDimensions() {
        return dimensionService.getAllDimension();
    }

    @RequestMapping("/dimensions/{id}")
    public Dimension getDimension(@PathVariable int id) {
        return dimensionService.getDimension(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/dimensions")
    public void addDimension(@RequestBody Dimension dimension) {
        dimensionService.addDimension(dimension);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/dimensions/{id}")
    public void updateDimension(@RequestBody Dimension dimension, @PathVariable int id) {
        dimensionService.updateDimension(dimension,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/dimensions/{id}")
    public void deleteDimension(@PathVariable int id) {
        dimensionService.deleteDimension(id);
    }
}
