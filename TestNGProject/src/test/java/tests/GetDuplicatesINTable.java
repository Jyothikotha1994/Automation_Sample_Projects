package tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class GetDuplicatesINTable {

	
	@Test
	public void dupli() {
		WebDriverManager.chromedriver().setup(); 
	    WebDriver driver = new ChromeDriver();       
		driver.get("https://www.iana.org/domains/reserved");

        // Get all the table cells containing datas
        List<WebElement> cells = driver.findElements(By.xpath("//table//tr[2]/td"));

        List<String> dataList = new ArrayList<>();
        Set<String> uniqueSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();

        for (WebElement cell : cells) {
            String data = cell.getText().trim();
            if (!uniqueSet.add(data)) {
                // Already exists → it's a duplicate
                duplicateSet.add(data);
            }
            dataList.add(data);
        }

        System.out.println("All datas: " + dataList);
        System.out.println("Duplicate datas: " + duplicateSet);

        driver.quit();
    }
}
