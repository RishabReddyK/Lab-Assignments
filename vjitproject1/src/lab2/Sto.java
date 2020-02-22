package lab2;
import java.util.Scanner;
public class Sto {
	
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("enter the option");
		int a= sc.nextInt();
		sc.close();
		switch(a)
		{
		case 1:System.out.println("add string to itself");
		  String s1= str.concat(str);
		  System.out.println(s1);
		   break;
		case 2:System.out.println("replace odd positions with #");
		    for(int i=0; i< str.length();i++)
		    	if(i%2!=0)
		    	{
		    		str=str.substring(0,i-1)+ "#" + str.substring(i,str.length());
		    	}
		      System.out.println(str);
		    break;
		case 3:System.out.println("remove duplicate values");
		    String input= str;
		    String s3=new String();
		    for (int i = 0; i < input.length(); i++) {
	            for (int j = 0; j < s3.length(); j++) {
	                if (input.charAt(i) != s3.charAt(j)) {
	                    s3 = s3 + input.charAt(i);
	                }
	            }
	        }
		    System.out.println(s3);
		    break;
		case 4: System.out.println("change odd characters to upper case");
		String x = str;
		for (int i = 0, len = x.length(); i < len; i++) {
		    char ch = x.charAt(i);
		    if (i % 2 == 0) {
		        System.out.print(Character.toLowerCase(ch));
		    } else {
		        System.out.print(Character.toUpperCase(ch));
		    }
		}
		System.out.println();
		break;
		    
		}
	}
}
	 