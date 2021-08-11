package com.coop.deptemployee.services;

import com.coop.deptemployee.models.Employee;
import com.coop.deptemployee.repositories.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmpRepo empRepo;

    public Employee addOrUpdate(Employee employee){
        return empRepo.save(employee);
    }

    public List<Employee> addAllEmployees(List<Employee> employees){
        return empRepo.saveAll(employees);
    }

    public List<Employee> getEmployees(){
        return empRepo.findAll();
    }

    public Optional<Employee> getOneEmployee(Long id){
        return empRepo.findById(id);
    }

    public void deleteEmployee(long id){
         empRepo.deleteById(id);
    }
}
