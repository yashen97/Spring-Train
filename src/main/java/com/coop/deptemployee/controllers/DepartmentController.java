package com.coop.deptemployee.controllers;

import com.coop.deptemployee.models.Department;
import com.coop.deptemployee.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/post")
    public String postDepartment(@RequestBody Department department){
        departmentService.addOrUpdate(department);
        return "200 Ok";
    }

    @PostMapping("/postall")
    public String postAllDepartments(@RequestBody List<Department> departments){
        departmentService.addAllDepartments(departments);
        return "200 Ok";
    }

    @GetMapping("/get")
    public @ResponseBody List<Department> getDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/getone/{id}")
    public @ResponseBody Optional<Department> getOneDept(@PathVariable Long id){
        return departmentService.getOneDepartment(id);
    }

    @PutMapping("/update")
    public String updateDept(@RequestBody Department department){
        departmentService.addOrUpdate(department);
        return "204 Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDept(@PathVariable Long id){
        departmentService.deleteDepartment(id);
        return "204 Deleted";
    }
}
