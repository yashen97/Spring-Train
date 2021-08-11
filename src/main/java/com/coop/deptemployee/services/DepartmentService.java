package com.coop.deptemployee.services;

import com.coop.deptemployee.models.Department;
import com.coop.deptemployee.repositories.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    DeptRepo deptRepo;

    public Department addOrUpdate(Department department){
       return deptRepo.save(department);
    }

    public List<Department> addAllDepartments(List<Department> departments){
        return deptRepo.saveAll(departments);
    }

    public List<Department> getAllDepartments(){
        return deptRepo.findAll();
    }

    public Optional<Department> getOneDepartment(Long id){
        return deptRepo.findById(id);
    }

    public void deleteDepartment(Long id){
        deptRepo.deleteById(id);
    }
}
