package com.facebook.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	 public WebDriver driver;
	
	public void openUrl() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Anjan\\Software\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void userName() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anjan@tcs.com");
	}
	
	public void password() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
	}
	
	public void loginButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
