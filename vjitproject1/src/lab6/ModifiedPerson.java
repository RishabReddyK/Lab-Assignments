package lab6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class EmptyNameException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyNameException(String msg){
		super(msg);
	}
}

enum Gender{
	M,F;
}

class Person1 {
	
	String first_name;
	String last_name;
	Gender gender;
	long p_no;
	int age ;
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Person1() {
		// TODO Auto-generated constructor stub
		setFirst_name("");
		setLast_name("");
		setGender(Gender.M);
		setP_no(908968768);
	}

	public long getP_no() {
		return p_no;
	}

	public void setP_no(long p_no) {
		this.p_no = p_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person1(String fn, String ln, Gender g, long p_no,int age){
		setFirst_name(fn);
		setLast_name(ln);
		setGender(g);
		setP_no(p_no);
		setAge(age);
	}
	
	public void calculateAge(LocalDate dob){
		LocalDate today = LocalDate.now();
		Period p = Period.between(dob, today);
		setAge(p.getYears());
		System.out.println("Age = "+getAge());
	}
	
	public String getFullName(){
		String fullName = "";
		try{
			if(getFirst_name()=="" && getLast_name()=="")
				throw new EmptyNameException("Invalid Name!!!");
			else
				fullName = getFirst_name()+" "+getLast_name();		
		}
		catch(EmptyNameException e)
		{	System.out.println(e.getMessage());}
		return fullName;
	}
	
	void getPhoneNo(long pn){
		p_no = pn;
	}
	
	void getDetails(){
		System.out.println("Full Name :"+getFullName());
		System.out.println("Gender :"+getGender());
		System.out.println("Phone No :"+getP_no());
		System.out.println("Age :"+getAge());
	}
	
}
public class ModifiedPerson{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 person = new Person1();
		System.out.println("Enter dob :");
		Scanner scanner = new Scanner(System.in);
		String userDate = scanner.nextLine();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dob = LocalDate.parse(userDate, df);
		person.calculateAge(dob);
		String fullName=person.getFullName();
		System.out.println("Full Name : "+fullName);
		person.getDetails();
		scanner.close();		
	}

}