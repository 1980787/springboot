package com.example.redemo.Service;

import com.example.redemo.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {
    Map<Long, Employee> employees = new HashMap<>();

    EmployeeService () {
        Employee susan = new Employee(1L, "Susan");
        Employee tom = new Employee(2L, "Tom");

        employees.put(susan.getId(), susan);
        employees.put(tom.getId(), tom);
    }

    public void createEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
        System.out.println("Created Employee");
    }

    public Collection<Employee> readEmployee() {
        return employees.values();
    }

    public void updateEmployee(Long id, Employee emp) {
        employees.remove(id);
        emp.setId(id);
        employees.put(id, emp);
        System.out.println(id + " employee data updated");
    }

    public void deleteEmployee(Long id) {
        employees.remove(id);
        System.out.println(id + " employee data deleted");
    }

}
