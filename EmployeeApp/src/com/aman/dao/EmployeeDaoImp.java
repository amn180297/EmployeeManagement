package com.aman.dao;

import java.util.List;

import com.aman.dto.Employee;
import com.aman.exception.ageException;
import com.aman.staticDB.EmployeeDataBase;

public class EmployeeDaoImp implements IEMployeedao{
	
	
	EmployeeDataBase empdb= new EmployeeDataBase();
	List<Employee> employeedetail=empdb.dblist;
	
	
	
	
	@Override
	public void addEmployeeDao(Employee employee) {
		// TODO Auto-generated method stub
		employeedetail.add(employee);
		System.out.println("Employee Added Sucessfully");
		
		
		
		
	}

	@Override
	public Employee searchEmployeeDao(int eid) {
		// TODO Auto-generated method stub
		
		
		Employee search=null;
		
		for (Employee employee : employeedetail) {
			if(eid==employee.getEid())
			{
				search=employee;
				break;
			}
		}
		return search;
	}

	
	
	
	
	
	@Override
	public void deleteEmployeeDao(int eid) {
		// TODO Auto-generated method stub
		int flag=0;
		for (Employee employee : employeedetail) {
			if(eid==employee.getEid())
			{
				employeedetail.remove(employee);
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("No Employee Found");
		} else {
			System.out.println("Employee Deleted");
		}
		
		
		
		
	}

	
	
	
	
	@Override
	public void modifyEmployeeDao(int eid, Employee employee) {
		// TODO Auto-generated method stub
		
		for (Employee emplo : employeedetail) {
			if(eid==employee.getEid())
			{
				try {
					emplo.setAge(employee.getAge());
					emplo.setEname(employee.getEname());
					emplo.setSalary(employee.getSalary());
					System.out.println("Employee Details Modified Sucessfully.");
				} catch (ageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			}
		}
		
		
		
		
	}

	
	
	
	
	@Override
	public List<Employee> showEmployeeDao() {
		// TODO Auto-generated method stub
		
		
		
		return employeedetail;
	}

	

}
