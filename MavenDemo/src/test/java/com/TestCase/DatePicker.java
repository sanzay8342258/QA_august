package com.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id=\'onward_cal\']")).click();
		driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[3]/td[3]")).click();
	}

}
