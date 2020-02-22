package lab2;

import lab2.PersonNew.Gender;

public class PersonMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PersonNew p1=new PersonNew();
     p1.setFirstname("manoj");
     p1.setLastname("rao");
     p1.setGender(Gender.M);
     p1.setP_no(987899);
     
     System.out.println("firstname is"+p1.getFirstname());
     System.out.println("lastname is"+p1.getLastname());
     System.out.println("gender is"+p1.getGender());
     System.out.println("phone no. is"+p1.getP_no());
     
     PersonNew p=new PersonNew();
     p.display();
     
	}

}
