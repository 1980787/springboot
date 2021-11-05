package com.example.redemo.Controller;

import com.example.redemo.Model.Employee;
import com.example.redemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController

@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public Collection<Employee> getEmployees() {
        return employeeService.readEmployee();
    }
    @PostMapping
    public void registerNewEmp(@RequestBody Employee emp) {
        employeeService.createEmployee(emp);
    }
    @PutMapping("{id}")
    public void updateEmp(@PathVariable("id") Long id, @RequestBody Employee emp) {
        employeeService.updateEmployee(id, emp);
    }
    @DeleteMapping("{id}")
    public void deleteEmp(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }
}
