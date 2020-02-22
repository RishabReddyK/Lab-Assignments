package com.cg.eis.pl;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;
public class Empusr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service s1=new Service();
        Employee e1=new Employee();
        e1.setId(101);
        e1.setName("asd");
        e1.setSalary(15000);
        s1.insscheme(14000);
        System.out.println("emp id is"+e1.getId());  
        System.out.println("emp salary is"+e1.getSalary());
        System.out.println("emp name is"+e1.getName());
	}

}
