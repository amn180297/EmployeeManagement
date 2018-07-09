package com.aman.staticDB;

import java.util.ArrayList;
import java.util.List;

import com.aman.dto.Employee;

public class EmployeeDataBase {
	public static List<Employee> dblist=null;
	static {
		dblist=new ArrayList<>();
	}
	public static List<Employee> databaseEmployee()
	{
		return dblist;
	}
}
