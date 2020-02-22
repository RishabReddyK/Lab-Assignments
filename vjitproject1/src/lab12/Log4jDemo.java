package lab12;

import org.apache.log4j.*;
public class Log4jDemo {
 static Logger log=Logger.getLogger(Log4jDemo.class.getName());
 public static void main(String args[])
 {
	 log.error("this is error message");
	 log.fatal("this is fatal message");
	 log.debug("this is debug message");
	 log.warn("this is warn message");
	 log.info("this is info message");
 }
}
