package _11_3_TestNG.Parameterization.Using_DataProviders_ExcelSheet;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationExcel_NW {

	private static final String SHEET_NAME = "loginTest";
	private static final String XLSX_FILE_NAME_WITH_PATH = ".//src//test//resources//parameterization//testngdata.xlsx";
	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void testData(String username, String password, String is_correct) {

		System.out.println(username + "--" + password + "--" + is_correct);
	}

	@DataProvider
	// Object - data can be in any format
	public Object[][] getData() {

		if (excel == null) {
			excel = new ExcelReader(XLSX_FILE_NAME_WITH_PATH);
		} else {

		}

		String sheetName = SHEET_NAME;
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		System.out.println("Rows: " + rows);
		System.out.println("Cols: " + cols);
		Object[][] data = new Object[rows - 1][1];

		for (int rowNum = 2; rowNum < rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				/* data[0][0] */
				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);

			}
		}

		/*
		 * data[0][0] = "nishant@gmail.com"; data[0][1] = "123";
		 * 
		 * data[1][0] = "rajat@gmail.com"; data[1][1] = "456";
		 * 
		 * data[2][0] = "gauty@gmail.com"; data[2][1] = "789";
		 */
		return data;

	}
}
