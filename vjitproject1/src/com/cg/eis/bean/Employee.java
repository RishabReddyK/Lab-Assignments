package com.cg.eis.bean;
import com.cg.eis.exception.*;
public class Employee {
	int id;
	String name;
    double salary;
    String designation;
    char scheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws EmployeeException {
			if(salary<3000)
				throw new EmployeeException("age cannot be below 3000");
			else this.salary = salary;
		

		
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public char getScheme() {
		return scheme;
	}
	public void setScheme(char scheme) {
		this.scheme = scheme;
	}
	
}
