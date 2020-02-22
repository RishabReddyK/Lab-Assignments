package lab2;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a= Integer.parseInt(args[0]);
       if(a>0)
    	   System.out.println(a+"is a positive number");
       else if(a<0)
    	   System.out.println(a+"is a negative number");
       else
    	   System.out.println(a+"is neither positive nor negative");
	}

}
