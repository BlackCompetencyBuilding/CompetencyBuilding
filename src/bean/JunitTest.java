package bean;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.Before;
import org.junit.Test;

public class JunitTest {

		@Before
		public void setup(){
			URLConnection openConnection = new URL("http://10.0.0.108:8080/job/JunitTest1/ws/WebContent").openConnection();
		openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			//setBaseUrl("http://10.0.0.108:8080/job/JunitTest1/ws/WebContent");
			//http://10.0.0.116:8080/job/JunitTest1/ws/WebContent/
		}
		@Test
		public void test(){
			beginAt("index1.jsp"); 
	        
	        assertTitleEquals("Login page");
	       // setTextField("Uname", "admin");
	       // setTextField("Password", "admin");
	      clickLink("register");
	        //submit();
	        assertTitleEquals("Registration Form");
		}
		
}
