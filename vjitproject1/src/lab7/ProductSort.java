package lab7;
import java.util.ArrayList;
import java.util.Collections;
public class ProductSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrli = new ArrayList<String>();
		arrli.add("def");
		arrli.add("abc");
        arrli.add("jkl");
        arrli.add("ghi");
         Collections.sort(arrli);
         System.out.println("elements after sorting");
         for(String s:arrli)
         {
        	 System.out.println(s);
         }
	}

}
