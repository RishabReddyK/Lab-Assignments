package lab7;
 import java.util.*;
public class ProductName {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String[] pnames=new String[4];
		for(int i=0;i<pnames.length;i++)
		{
			System.out.print("enter the product name"+ " "+i);
			pnames[i]=sc.nextLine();
		}
		sc.close();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(pnames));
		System.out.println("Java String converted to ArrayList: " + list);
		Collections.sort(list);
		System.out.println("after sorting"+list);
	}

}
