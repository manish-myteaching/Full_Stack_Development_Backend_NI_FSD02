package com.barclays.dao;

import java.util.List;

import com.barclays.dto.Employee;

public interface EmployeeDAO {

	int createEmployeeRecord(Employee employee);

	int deleteEmployeeRecord(int id);

	int updateEmployeeRecord(Employee employee);

	Employee getEmployeeRecord(int id);
	
	List<Employee> getEmployeeRecord();
}
