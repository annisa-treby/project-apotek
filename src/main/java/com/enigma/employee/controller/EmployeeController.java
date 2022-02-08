package com.enigma.employee.controller;

import com.enigma.employee.models.Employee;
import com.enigma.employee.models.Position;
import com.enigma.employee.services.EmployeeService;
import com.enigma.employee.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @Autowired
    PositionService positionService;

    @PostMapping
    @CrossOrigin
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.insert(employee);
    }

    @PutMapping
    @CrossOrigin
    public Employee editEmployee(@RequestBody Employee employee){
        return service.update(employee);
    }

    @DeleteMapping
    @CrossOrigin
    public Employee deleteEmployee(@RequestBody Employee employee){
        return service.delete(employee);
    }

    @GetMapping
    @CrossOrigin
    public List<Employee> getAllEmployee(){
        return service.getEmployeeList();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Employee getEmployeeById(@PathVariable String id){
        return service.getById(id);
    }

    @GetMapping("/position")
    @CrossOrigin
    public List<Position> getAllPosition(){
        return positionService.getPositionList();
    }

    @PostMapping("/position")
    @CrossOrigin
    public Position savePosition(@RequestBody Position position){
        return positionService.insert(position);
    }
}
