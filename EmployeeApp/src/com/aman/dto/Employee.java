package com.aman.dto;

import com.aman.exception.ageException;

public class Employee {
	
	private int Eid;
	private String Ename;
	double salary;
	int age;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int eid, String ename, double salary, int age) {
		super();
		Eid = eid;
		Ename = ename;
		this.salary = salary;
		this.age = age;
	}


	public int getEid() {
		return Eid;
	}


	public void setEid(int eid) {
		Eid = eid;
	}


	public String getEname() {
		return Ename;
	}


	public void setEname(String ename) {
		Ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) throws ageException {
		if (age>18) {
			this.age=age;
		} else {
			
			throw new ageException("invalid age");
		}
		
	}
	
	
	

}
