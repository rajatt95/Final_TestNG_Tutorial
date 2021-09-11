package _04_TestNG.Grouping;

import org.testng.annotations.Test;

public class CreditCard_MASTER {

	@Test(groups = {"Smoke"})
	public void TC_CreditCard_MASTER_1() {
		System.out.println("Credit card - MASTER : SMOKE");
	}

	
	@Test(groups = {"Smoke","Functional"})
	public void TC_CreditCard_MASTER_2() {
		System.out.println("Credit card - MASTER : SMOKE, FUNCTIONAL");
	}

	
	@Test(groups = {"Functional"})
	public void TC_CreditCard_MASTER_3() {
		System.out.println("Credit card - MASTER : FUNCTIONAL");
	}

	
}
