package com.coop.deptemployee.repositories;

import com.coop.deptemployee.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Department,Long> {
}
