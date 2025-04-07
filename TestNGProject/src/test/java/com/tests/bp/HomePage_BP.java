package com.tests.bp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage_BP {
	

	static WebDriver driver;
	private Boolean True;
	/*
	 * public static void homePageLocator() { WebElement home_button =
	 * driver.findElement(By.xpath("//span[text()='Home']/parent::button"));
	 * WebElement Inventory_button
	 * =driver.findElement(By.xpath("//span[text()='Invantory']/parent::button"));
	 * WebElement Add_Inventory
	 * =driver.findElement(By.linkText("/dashboard/inventory/add_inventory"));
	 * WebElement Bill_button
	 * =driver.findElement(By.xpath("//span[text()='Bill']/parent::button"));
	 * 
	 * }
	 */
	@Test
	public void verify_Homepage_Elements() {
		driver.get("http://192.168.0.103:3000/dashboard");
		WebElement home_button = driver.findElement(By.xpath("//span[text()='Home']/parent::button"));
		WebElement Inventory_button =driver.findElement(By.xpath("//span[text()='Invantory']/parent::button"));
		WebElement Add_Inventory =driver.findElement(By.linkText("/dashboard/inventory/add_inventory"));
		WebElement Bill_button =driver.findElement(By.xpath("//span[text()='Bill']/parent::button"));
		Inventory_button.click();
		boolean Add_Inventory_enabled= Add_Inventory.isEnabled();
		Assert.assertEquals(True, Add_Inventory_enabled);
	}
	
	
	

}
