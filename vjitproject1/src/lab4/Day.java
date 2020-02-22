package lab4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Day {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date in the format of dd/mm/yyyy");
		System.out.println("enter end date");
		String date=sc.nextLine();
		String date1=sc.nextLine();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate startDate=LocalDate.parse(date,df);
		LocalDate endDate=LocalDate.parse(date1,df1);
		Period p=Period.between(startDate, endDate);
		int days=p.getDays();
		int months=p.getMonths();
		int years=p.getYears();
		System.out.println("no.of days="+days);
		System.out.println("no.of months="+months);
		System.out.println("no.of yeras="+years);
		sc.close();
		
	}

}
