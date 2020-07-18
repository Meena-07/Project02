package com.snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meena\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\SnapDeal\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	signin.click();
	
	WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
	login.click();
	driver.switchTo().frame("loginIframe");
	
	WebElement email = driver.findElement(By.xpath("//input[@id='userName']"));
	email.sendKeys("meenaameen96@gmail.com");
			
	}

}
