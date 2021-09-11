package _11_1_TestNG.Parameterization.Using_XML;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Personal_Loan {

	@Test
	@Parameters({ "application_URL", "username", "password", "API/key" })

	public void TC_APILogin(String application_URL, String uname, String pwd, String apiKey) {
		System.out.println("Login - RestAssured");
		System.out.println("application_URL: " + application_URL);
		System.out.println("uname: " + uname);
		System.out.println("pwd: " + pwd);
		System.out.println("apiKey: " + apiKey);

	}

}
