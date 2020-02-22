package lab10;
import java.io.*;
import java.util.Properties;
public class FetchDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileReader fs = new FileReader("C:\\Users\\risha\\eclipse-workspace\\vjitproject1\\src\\lab10\\fetch.properties");
			Properties input = new Properties();
			input.load(fs);
			//System.out.println(input);
			System.out.println("First Name :"+input.getProperty("first_name"));
			System.out.println("Last Name :"+input.getProperty("last_name"));
			System.out.println("Age :"+input.getProperty("age"));
			System.out.println("Mobile number :"+input.getProperty("phone_no"));
			System.out.println("City :"+input.getProperty("city"));
			fs.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
