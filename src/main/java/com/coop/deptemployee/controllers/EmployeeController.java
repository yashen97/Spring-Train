package com.coop.deptemployee.controllers;

import com.coop.deptemployee.models.Employee;
import com.coop.deptemployee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/post")
    public String postEmployee(@RequestBody Employee employee){
        employeeService.addOrUpdate(employee);
        return "200 Ok";
    }

    @PostMapping("/postall")
    public String postEmployees(List<Employee> employees){
        employeeService.addAllEmployees(employees);
        return "200 Ok";
    }

    @GetMapping("/get")
    public @ResponseBody List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/getone")
    public @ResponseBody Optional<Employee> getOneEmployee(@PathVariable Long id){
        return employeeService.getOneEmployee(id);
    }

}
