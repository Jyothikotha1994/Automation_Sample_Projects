package listener;

import org.testng.annotations.Test;

public class ExcelTest {
    @Test(dataProvider = "Excel data", dataProviderClass = ReadExcelForDataprovider.class)
    public void testExcelData(String username, String password) {
        System.out.println("Testing with: " + username + " - " + password);
    }
}