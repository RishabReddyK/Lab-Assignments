package com.cg.eis.service;
import com.cg.eis.bean.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class EmployeeServiceImpl {
  HashMap<String,Employee> map=new HashMap<String,Employee>();
	Employee e;
	public void addEmployee(Employee e1)
	{
		map.put(e1.getName(), e1);
	}
	public void displayDetails()
	{
		Set<Entry<String,Employee>> set=map.entrySet();
		Iterator<Entry<String,Employee>> it=set.iterator();
		while(it.hasNext()){
			@SuppressWarnings("rawtypes")
			Map.Entry me=(Map.Entry)it.next();
			e=(Employee)me.getValue();
			System.out.println("=======================");
			System.out.println(e.getDesignation());
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println(e.getScheme());
		}
	}
	public boolean deleteEmployees(int id)
	{
		Set<Entry<String,Employee>> set=map.entrySet();
		Iterator<Entry<String,Employee>> it=set.iterator();
		while (it.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Map.Entry me=(Map.Entry)it.next();
			Employee e=(Employee) me.getValue();
			if(e.getId()==id)
			{
				map.remove(me.getKey());
			}
		}
		return false;
	}
}
