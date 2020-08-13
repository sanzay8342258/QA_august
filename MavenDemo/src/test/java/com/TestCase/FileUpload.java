package com.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://filebin.net/");
		
		driver.findElement(By.id("fileField")).sendKeys("C:\\Downloads\\homework.txt");
		
		//driver.findElement(By.xpath("//*[@id=\'fileField\']")).sendKeys("C:\\\\Downloads\\\\homework.txt");
		//driver.findElement(By.xpath()).sendKeys("‪‪C:\\Downloads\\homework.txt");
		//driver.findElement(By.id("fileField")).sendKeys("‪‪");
	}

}
