package com.salescode.services;


import com.salescode.models.Employee;
import com.salescode.repositories.EmployeeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;

    @Transactional
    public Employee addEmployee(Employee employee) {
        employeeRepository.persist(employee);
        return employee; // now has its generated id
    }

    @Transactional
    public boolean deleteEmployee(Long id) {
        return employeeRepository.deleteById(id);
    }
}
