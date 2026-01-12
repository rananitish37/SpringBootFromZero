package com.codex.SpringBootDay04.repositories;

import com.codex.SpringBootDay04.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

}
