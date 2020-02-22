
public class EmployeeDetails {
int empid;
String ename;
float esal;

  public EmployeeDetails()
  {
	  
  }
  public EmployeeDetails(int empid,String ename,float esal)
  {
	  this.empid=empid;
	  this.ename=ename;
	  this.esal=esal;
  }
  public void calsalary()
  {
	  System.out.println("employee salary :"+(esal+2000));
  }
  public static void main(String args[])
  {
	  EmployeeDetails ed= new EmployeeDetails();
	  ed.calsalary();
  }
}
