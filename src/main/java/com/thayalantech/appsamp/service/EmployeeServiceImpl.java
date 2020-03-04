package com.thayalantech.appsamp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.thayalantech.appsamp.dao.EmployeeDAO;
import com.thayalantech.appsamp.entity.Employee;
@Component
public class EmployeeServiceImpl implements EmployeeService{
	@Resource 
	EmployeeDAO employeeDao;
	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
	@Override
	public void insertEmployee(Employee emp) {
		employeeDao.insertEmployee(emp);
		
	}
	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		
	}
	@Override
	public void executeUpdateEmployee(Employee emp) {
		employeeDao.executeUpdateEmployee(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeDao.deleteEmployee(emp);
		
	}
}