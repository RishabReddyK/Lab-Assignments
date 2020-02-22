package lab2;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Zone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime today = LocalDateTime.now();
		 
		ZoneId id = ZoneId.of("Europe/Paris");  
		 
		ZonedDateTime zonedDateTime = ZonedDateTime.of(today, id); 
		System.out.println(zonedDateTime);

	}

}
