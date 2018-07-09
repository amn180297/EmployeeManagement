package com.aman.service;

import java.util.List;

import com.aman.dto.Employee;

public interface IEmployeeService {
	public void addEmployee(Employee employee);
	public Employee searchEmployee(int eid);
	public void deleteEmployee(int eid);
	public void modifyEmployee(int eid, Employee employee);
	public List<Employee> showEmployee();
}
