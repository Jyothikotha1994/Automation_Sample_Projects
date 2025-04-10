package tests;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Itestlistener.class)
public class HomePageTest {
	public static WebDriver driver;
	public HomePageTest(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Invantory']/parent::button")
	WebElement Inventory_button;
	@FindBy(xpath="//a[text()='Add inventory']")
	WebElement Add_Inventory;
	@FindBy(xpath="//span[text()='Bill']/parent::button")	
	WebElement Bill_button; 
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite!!");
		System.out.println("TestNG is working!");
        WebDriverManager.chromedriver().setup(); 
    	driver = new ChromeDriver();
        driver.get("http://192.168.0.103:3000/dashboard");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Suite!!");
	}
	
    @Test(invocationCount = 4, priority = 1,groups="regression")
    public void testHomePage() {
        
	//	WebElement home_button = driver.findElement(By.xpath("//span[text()='Home']/parent::button"));
		WebElement Inventory_button =driver.findElement(By.xpath("//span[text()='Invantory']/parent::button"));
		
	    
		Inventory_button.click();
		System.out.println("click action done!!");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		/*Actions action = new Actions(driver);
		WebElement Add_Inventory =driver.findElement(By.xpath("//a[text()='Add inventory']"));
		action.moveToElement(Add_Inventory);
		System.out.println("Hover action done!!");
		boolean Add_Inventory_enabled= Add_Inventory.isEnabled();
		Assert.assertTrue(Add_Inventory_enabled,"Add inventory enabled");
		driver.quit();
		*/
		
		
    }
    @Test
    public void verify_AddInventory_Enabled() {
    	Actions action = new Actions(driver);
		WebElement Add_Inventory =driver.findElement(By.xpath("//a[text()='Add inventory']"));
		action.moveToElement(Add_Inventory);
		System.out.println("Hover action done!!");
		boolean Add_Inventory_enabled= Add_Inventory.isEnabled();
		Assert.assertTrue(Add_Inventory_enabled,"Add inventory enabled");
		    	
    }
    @Test
    public void verify_Bill_Button_enabled() {
    	Actions action = new Actions(driver);
    	WebElement Bill_button =driver.findElement(By.xpath("//span[text()='Bill']/parent::button"));
		action.moveToElement(Bill_button);
		System.out.println("Hover action done!!");
		boolean Bill_enabled= Bill_button.isEnabled();
		Assert.assertTrue(Bill_enabled,"Add inventory enabled");
		Bill_button.click();
		System.out.println("bill click done!!");
		    	
    }
    
    @AfterTest
	public void afterTest() {
		System.out.println("After Test!!");
		driver.quit();
		System.out.println("Driver quit done");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After Each!!");
	}
	@BeforeEach
	public void BeforeEach() {
		System.out.println("Before Each!!");
	}
}
