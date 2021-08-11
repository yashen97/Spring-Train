package com.coop.deptemployee.repositories;

import com.coop.deptemployee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Long> {
}
