package com.learnSpring.CRUDDemo.services;

import com.learnSpring.CRUDDemo.models.Employee;
import com.learnSpring.CRUDDemo.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    void saveEmployee(Employee employee);
}
