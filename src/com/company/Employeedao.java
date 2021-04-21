package com.company;

import java.sql.SQLException;
import java.util.List;

public interface Employeedao {
    void addEmployee(Employee employee) throws SQLException;
    void updateEmployee(Employee employee) throws SQLException;
    void deleteEmployee(Employee employee) throws SQLException;
    Employee getEmployeeById(int empId) throws SQLException;
    List<Employee> getEmployees() throws SQLException;
}