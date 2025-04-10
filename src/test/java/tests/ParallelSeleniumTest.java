package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelSeleniumTest {
 WebDriver driver;
 
 @Parameters("browser")
 @BeforeMethod
 public void setup(String browser) {
	 if(browser.equalsIgnoreCase("chrome")) {
		 WebDriverManager.chromedriver().setup(); 
		 driver = new ChromeDriver();
	 }
	 else if(browser.equalsIgnoreCase("firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	 }
	 else if(browser.equalsIgnoreCase("edge")) {
		 WebDriverManager.edgedriver().setup(); 
		 driver = new EdgeDriver();
	 }
 }
 @FindBy(id="name")
  WebElement txt_username;
  
 
 @Test
 public void testGoogle() {
     driver.get("https://www.google.com");
     System.out.println("Page Title: " + driver.getTitle());
 }

 @AfterMethod
 public void teardown() {
     driver.quit();
 }
}
