package com.mastery.java.dao;

import com.mastery.java.entity.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProfileMapper implements RowMapper<Employee> {



    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployee_id(rs.getInt("employee_id"));
        employee.setFirst_name(rs.getString("first_name"));
        employee.setLast_name(rs.getString("last_name"));
        employee.setDepartment_id(rs.getInt("department_id"));
        employee.setJob_title(rs.getString("job_title"));
        employee.setGender(rs.getString("gender"));
        employee.setDate_of_birth(rs.getString("date_of_birth"));


        return employee;
    }
}
