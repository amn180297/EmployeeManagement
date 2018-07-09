package com.aman.dao;

import java.util.List;

import com.aman.dto.Employee;

public interface IEMployeedao {
	public void addEmployeeDao(Employee employee);
	public Employee searchEmployeeDao(int eid);
	public void deleteEmployeeDao(int eid);
	public void modifyEmployeeDao(int eid, Employee employee);
	public List<Employee> showEmployeeDao();
}
