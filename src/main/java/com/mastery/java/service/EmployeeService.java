package com.mastery.java.service;


import com.mastery.java.dao.EmployeeDao;
import com.mastery.java.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAll(){
        return employeeDao.findAll();
    }

    public Employee getEmployee(int employee_id){
        return employeeDao.getEmployeeById(employee_id);
    }

    public void delEmployee(int employee_id){
        employeeDao.delEmployeeById(employee_id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeDao.createEmployee(employee);
    }

    public  Employee updateEmployee(int employee_id, Employee employee){
        return  employeeDao.updateEmployee(employee_id, employee);
    }


}
