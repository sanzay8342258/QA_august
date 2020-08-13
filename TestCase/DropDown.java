package com.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	public static void main(String[]args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\San Zay\\Desktop\\QA\\jars\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com/");  	// get the web link to the driver
		
		driver.get("https://opensource-demo.orangehrmlive.com/");  	// get the web link to the driver
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		Select userRole = new Select(driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']")));
		userRole.selectByVisibleText("ESS");
		Select status = new Select(driver.findElement(By.xpath("//*[@id=\'searchSystemUser_status\']")));
		status.deselectByIndex(2);
		status.selectByValue("0");
		/*
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.getTitle();							// get title of the link
		System.out.println(driver.getTitle());		// print out the title of the web
		//driver.close();								// close the driver and browser
		//driver.quit();							// just quit the driver
		 */
	}
}


//*[@id="u_0_b"]