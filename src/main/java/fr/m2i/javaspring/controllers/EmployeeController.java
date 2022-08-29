package fr.m2i.javaspring.controllers;

import fr.m2i.javaspring.entities.Employee;
import fr.m2i.javaspring.repository.EmployeeRepo;
import fr.m2i.javaspring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService service;
    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        return service.findAll();
    }
}
