package com.salescode.repositories;


import com.salescode.models.Employee;
import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Employee> {
    // We can add custom queries later if needed.
}
