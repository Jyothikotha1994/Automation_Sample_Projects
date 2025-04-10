package com.tests.bp;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage_BP {
	

	static WebDriver driver;
	private Boolean True;
	String huburl = "http://192.168.137.1:4444";
	String url = "http://192.168.0.103:3000/dashboard";
	
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
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "chrome");
		try {
			driver = new RemoteWebDriver(new URL(huburl), cap);
		
		
			driver.get(url);
		
			WebElement home_button = driver.findElement(By.xpath("//span[text()='Home']/parent::button"));
			WebElement Inventory_button =driver.findElement(By.xpath("//span[text()='Invantory']/parent::button"));
			WebElement Add_Inventory =driver.findElement(By.linkText("/dashboard/inventory/add_inventory"));
			WebElement Bill_button =driver.findElement(By.xpath("//span[text()='Bill']/parent::button"));
			Inventory_button.click();
			boolean Add_Inventory_enabled= Add_Inventory.isEnabled();
			Assert.assertEquals(True, Add_Inventory_enabled);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void latmethod() {}
	
	
	

}
