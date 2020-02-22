package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class User {

	static boolean checks(String str)
	{
		 int n=str.length();
		 char c[]=new char[n];
		 for(int i=0;i<n;i++)
		 {
			 c[i]=str.charAt(i);
		 }
		 Arrays.parallelSort(c);
		 
		 for(int i=0;i<n;i++)
		 {
			 if(c[i]!=str.charAt(i))
				 return false;
		 }
		 return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method st
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean result=checks(str);
         if(result==true)
         {
        	 System.out.println("positive string");
         }
         else
        	 System.out.println("negative string");
         sc.close();
	}

}
