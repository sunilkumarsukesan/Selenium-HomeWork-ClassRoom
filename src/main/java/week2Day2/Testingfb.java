package week2Day2;

import org.junit.Test;

import wdMethods.SeMethods;

public class Testingfb extends SeMethods{
	
@Test
	public void login() {
		
		startApp("chrome","http://fb.com");
		takeSnap();
		type(locateElement("email"),"testing");
		type(locateElement("pass"),"123456");
		click(locateElement("loginbutton"));
		
	}

}
