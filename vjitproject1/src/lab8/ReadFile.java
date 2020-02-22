package lab8;
import java.io.*;
public class ReadFile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        File file=new File("C:\\Users\\risha\\OneDrive\\Desktop\\java\\Assignment.java");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st;
        while((st=br.readLine())!=null)
        	System.out.println(st);
        br.close();
	}

}
