package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab2.PersonNew.Gender;

class PersonNewTest {
 PersonNew p=new PersonNew("Rishab","Reddy",Gender.M,987656);
	@Test
	public void testgetP_no() {
		System.out.println("test for phone no");
		assertEquals(987656,p.getP_no());
	}
	@Test
	public void testgetFirstname()
	{
		System.out.println("test for first name");
		assertEquals("Rishab",p.getFirstname());
	}
	@Test
	public void testgetLastname()
	{
		System.out.println("test for lastname");
		assertEquals("Reddy",p.getLastname());
	}
	@Test
	public void testgetGender()
	{
		System.out.println("test for gender");
		assertEquals(Gender.M,p.getGender());
	}
	@Test
    public void testgetFullname()
    { 
    	System.out.println("test for full name");
    	assertEquals("RishabReddy",p.getFullname("Rishab","Reddy"));
    }
}
