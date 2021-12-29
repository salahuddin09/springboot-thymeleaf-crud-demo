package com.springboot.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.cruddemo.model.Employee;
import com.springboot.cruddemo.model.User;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	User findByEmail(String email);
}
