package lab2;

public class PersonNew  {
	
 enum Gender{M,F};
	String firstname;
	String lastname;
	Gender gender;
	long p_no;
	String fullname;
	
	PersonNew()
	{
	    firstname="rishab";
		 lastname="reddy";
		 gender=Gender.M;
		 p_no=98675;
	}
	PersonNew(String firstname,String lastname,Gender gender,long p_no)
	{
		setFirstname(firstname);
		setLastname(lastname);
		setGender(gender);
		setP_no(p_no);
	}
	public long getP_no() {
		return p_no;
	}
	public void setP_no(long p_no) {
		this.p_no = p_no;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getFullname(String firstname,String lastname) {
		return fullname=firstname+lastname;
	}
	void display()
	{
		System.out.println("first name is"+getFirstname());
		System.out.println("last name is"+getLastname());
		System.out.println("gender is"+getGender());
		System.out.println("phone no is"+getP_no());
	}
}
