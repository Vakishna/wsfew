package com.thayalantech.appsamp.dao;


import java.util.List;

import com.thayalantech.appsamp.entity.Employee;


public interface EmployeeDAO {
    List<Employee> findAll();
    void insertEmployee(Employee emp);
    void updateEmployee(Employee emp);
    void executeUpdateEmployee(Employee emp);
    public void deleteEmployee(Employee emp);
}