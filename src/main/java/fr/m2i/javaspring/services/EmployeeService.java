package fr.m2i.javaspring.services;

import fr.m2i.javaspring.entities.Employee;
import fr.m2i.javaspring.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }
}
