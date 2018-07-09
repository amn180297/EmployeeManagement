package com.aman.service;

import java.util.List;

import com.aman.dao.EmployeeDaoImp;
import com.aman.dto.Employee;

public class EmployeeServiceImp implements IEmployeeService {
	EmployeeDaoImp employeeDao = new EmployeeDaoImp();
	
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.addEmployeeDao(employee);
		
	}

	@Override
	public Employee searchEmployee(int eid) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployeeDao(eid);
	}

	@Override
	public void deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployeeDao(eid);
		
	}

	@Override
	public void modifyEmployee(int eid, Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.modifyEmployeeDao(eid, employee);
		
		
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.showEmployeeDao();
	}

}
