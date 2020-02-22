package lab8;
import java.io.*;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		try {
			FileReader file=new FileReader("C:\\Users\\risha\\OneDrive\\Desktop\\cprgms\\numbers.txt");
			BufferedReader input=new BufferedReader(file);
			String line;
			int num;
			while((line=input.readLine())!=null)
			{
				Scanner in=new Scanner(line);
				in.useDelimiter(",");
				while(in.hasNext())
				{
					num=Integer.parseInt(in.next());
					if(num%2==0)
					{
						System.out.print(num+" ");
					}
				}
				in.close();
			}
			input.close();
		}
         catch(Exception e)
		{
        	 System.out.println(e);
		}
           
	}

}
