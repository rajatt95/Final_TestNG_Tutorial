package _11_1_TestNG.Parameterization.Using_XML;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Personal_Loan_Priority_LocalVariable {

	@Test
	@Parameters({ "application_URL", "username", "password" })

	public void TC_WebLogin(String application_URL, String uname, String pwd) {
		System.out.println("-----------------");
		System.out.println("Login - Selenium");
		System.out.println("application_URL: " + application_URL);
		System.out.println("uname: " + uname);
		System.out.println("pwd: " + pwd);

	}

}
