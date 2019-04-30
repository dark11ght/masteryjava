package com.mastery.java.controllers;

import com.mastery.java.entity.Employee;
import com.mastery.java.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employ")
public class Controller {
    private final EmployeeService employeeService;

    @Autowired
    public Controller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployee(){
        return employeeService.getAll();

    }

    @GetMapping("{id}")
    public Employee getOne(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("{id}")

    public void delete(@PathVariable int id){
        employeeService.delEmployee(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return employee;
    }



    @PutMapping("{id}")
    public Employee update (@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateEmployee(id, employee);
        return employee;
    }




}
