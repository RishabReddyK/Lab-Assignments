package com.cg.eis.bean;

import org.junit.jupiter.api.Test;

import com.cg.eis.exception.EmployeeException;

class EmployeeTest {

	@Test(expected=EmployeeException.class)
	 public void testsalary() throws EmployeeException
	 {
		Employee e=new Employee();
		e.setSalary(1000);
	 }

}
