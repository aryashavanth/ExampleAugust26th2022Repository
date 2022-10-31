package com.sgtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem3 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		
	
		
	}
private static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
	oBrowser=new ChromeDriver();
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
	
}
private static void navigate()
{
	try
	{
		oBrowser.get("https://opensource-demo.orangehrmlive.com/");	
		Thread.sleep(5000);
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
}
private static void login()
{
	try
	{
		oBrowser.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
		oBrowser.findElement(By.name("password")).sendKeys("admin123");
		oBrowser.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
}
}
