package com.cg.eis.service;
import com.cg.eis.bean.*;

import java.io.*;
interface EmployeeService
{
  public void insscheme(double sal);	
}
public class Service implements EmployeeService 
{
	 Employee e= new Employee();
	 @Override
		public void insscheme(double sal)
		{
			if(sal>5000 && sal<20000)
			{
				e.setDesignation("System Associate");
				e.setScheme('C');
			}
			else if(sal>=20000&&sal<40000)
			{
				e.setDesignation("programmer");
				e.setScheme('B');
			}
			else if(sal>=40000)
			{
				e.setDesignation("manager");
				e.setScheme('A');
			}
			else
			{
				e.setDesignation("clerk");
				e.setScheme('\0');
			}
			
				System.out.println("designation"+e.getDesignation());
				System.out.println("Scheme is"+e.getScheme());
		}

public void addObjectToFile(Employee emp){
	try {
		FileOutputStream fw = new FileOutputStream("C:\\Users\\risha\\OneDrive\\Desktop\\4-1\\employee.txt");
		ObjectOutputStream out = new ObjectOutputStream(fw);
		out.writeObject(emp);
		out.close();	
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}

public Object readObjectFromFile(){
	try {
		FileInputStream fi = new FileInputStream("C:\\Users\\risha\\OneDrive\\Desktop\\4-1\\employee.txt");
		ObjectInputStream in = new ObjectInputStream(fi);
		Object o = in.readObject();
		in.close();
		return o;
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}
}


