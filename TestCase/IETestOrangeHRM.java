package com.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class IETestOrangeHRM {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\San Zay\\Desktop\\QA\\jars\\IEDriverServer_Win32_3.150.1\\IEDriverServer2.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");  	// get the web link to the driver
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.close();
	}

}


//*[@id="u_0_b"]