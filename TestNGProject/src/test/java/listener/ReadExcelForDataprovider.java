package listener;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.DataProvider;

public class ReadExcelForDataprovider {
	
	@DataProvider(name="Excel data")
 public static Object[][] readexceldata() throws IOException{
		FileInputStream file = new FileInputStream("data.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) { // Skipping header row
            Row row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                data[i - 1][j] = row.getCell(j).toString();
            }
        }
        workbook.close();
        return data;
    }
}



