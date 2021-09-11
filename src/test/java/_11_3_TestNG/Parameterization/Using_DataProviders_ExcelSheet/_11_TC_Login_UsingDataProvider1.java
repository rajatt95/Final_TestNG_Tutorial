package _11_3_TestNG.Parameterization.Using_DataProviders_ExcelSheet;

import java.util.Hashtable;

import org.testng.annotations.Test;

// _11_TC_Login_UsingDataProvider1 - Sheet name inside testdata.xlsx file
public class _11_TC_Login_UsingDataProvider1 {

	/* Email, Password - Column Headings in Excel sheet */
	public static String excel_username = "Email";
	public static String excel_password = "Password";

	@Test(dataProviderClass = DataProviders.class, dataProvider = "excel_dataProvider")
	public void TC_Login_UsingDataProvider(Hashtable<String, String> data) {

		String email = data.get(excel_username);
		String password = data.get(excel_password);

		System.out.println("EMail: " + email);
		System.out.println("Password: " + password);
		System.out.println("-------------------------");
	}
}
