package _04_TestNG.Grouping;

import org.testng.annotations.Test;

public class CreditCard_VISA {

	@Test(groups = { "Sanity" })
	public void TC_CreditCard_Visa_1() {
		System.out.println("Credit card - VISA : SANITY");
	}

	@Test(groups = { "Sanity", "Functional" })
	public void TC_CreditCard_Visa_2() {
		System.out.println("Credit card - VISA : SANITY");
	}

}
