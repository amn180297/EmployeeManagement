package com.aman.ui;

import java.util.List;
import java.util.Scanner;

import com.aman.dto.Employee;
import com.aman.exception.ageException;
import com.aman.service.EmployeeServiceImp;

public class EmployeeMain {
	static Scanner sc= new Scanner(System.in);
	static EmployeeServiceImp employeeServiceImp=new EmployeeServiceImp();
	public static void main(String[] args) {
		int choice=0;
		// TODO Auto-generated method stub
		do {
			Scanner sc= new Scanner(System.in);
			menu();
			System.out.println("\nEnter Choise");
			choice=sc.nextInt();
			switch (choice) {
			case 1: addEmployee();
				break;
			case 2: searchEmployee();
				break;	
			case 3: deleteEmployee();
				break;	
			case 4:	modifyEmployee();
				break;
			case 5: showEmployee();
				break; 
			case 6: System.out.println("Exiting Application..............");System.exit(0);
			break;
			default:System.out.println("Enter Correct Choise");
				break;
			}
			
		} while (choice!=6);
		
	}

	private static void showEmployee() {
		// TODO Auto-generated method stub
		List<Employee> empdetails=employeeServiceImp.showEmployee();
		
		for (Employee searchData : empdetails) {
			
			System.out.println("ID:"+searchData.getEid());
			System.out.println("NAME: "+ searchData.getEname());
			System.out.println("AGe"+ searchData.getAge());
			System.out.println("SALARY"+searchData.getSalary());
			
		}
		
		
		
		
	}

	private static void modifyEmployee() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter Emloyee Id:");
		int id=sc.nextInt();
		Employee searchData=employeeServiceImp.searchEmployee(id);
		if (searchData==null) {
			System.out.println("NO employee Found");
			
		} else {
		
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Salary");
			double salary=sc.nextDouble();
			System.out.println("Enter Employee Age");
			int age=sc.nextInt();
			
			Employee emp=new Employee();
			try {				
				emp.setAge(age);
				emp.setEname(name);
				emp.setSalary(salary);
				employeeServiceImp.modifyEmployee(id, emp);
			} catch (ageException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			
			
		}
		
		
		
		
	}

	private static void deleteEmployee() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Employee Id ");
		int id=sc.nextInt();
		employeeServiceImp.deleteEmployee(id);
		
		
		
		
	}

	private static void searchEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Emloyee Id:");
		int id=sc.nextInt();
		Employee searchData=employeeServiceImp.searchEmployee(id);
		if (searchData==null) {
			System.out.println("NO employee Found");
			
		} else {
			System.out.println("ID:"+searchData.getEid());
			System.out.println("NAME: "+ searchData.getEname());
			System.out.println("AGe"+ searchData.getAge());
			System.out.println("SALARY"+searchData.getSalary());
		}
		
		
		
		
		
	}

	private static void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Id ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name");
		String name=sc.next();
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		System.out.println("Enter Employee Age");
		int age=sc.nextInt();
		
		Employee employee=new Employee();
		
		try {

			employee.setAge(age);
			employee.setEid(id);
			employee.setEname(name);
			employee.setSalary(salary);
			employeeServiceImp.addEmployee(employee);
		} catch (ageException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("Employee Management System:\n------------------------------");
		System.out.println("MENU:");
		System.out.println("1. Add Employee\n2. Search Employee\n3. Delete Employee\n"
				+ "4. Modify Employee\n5.Show all Employee\n6. Exit");
	}

}
