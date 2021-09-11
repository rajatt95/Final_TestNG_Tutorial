package _11_3_TestNG.Parameterization.Using_DataProviders_ExcelSheet;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;


public class DataProviders {

	public final static String excelSheet = ".//src//test//resources//excel//testdata.xlsx";


	
	public static ExcelReader excel = new ExcelReader(excelSheet);

	// excel_dataProvider - This is the name of the Data provider
	@DataProvider(name = "excel_dataProvider")
	public Object[][] getData(Method methodName) {

		String sheetName = methodName.getName();
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];

		Hashtable<String, String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2
			table = new Hashtable<String, String>();
			for (int colNum = 0; colNum < cols; colNum++) {
				// data[0][0]
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}
		}
		return data;
	}

}
