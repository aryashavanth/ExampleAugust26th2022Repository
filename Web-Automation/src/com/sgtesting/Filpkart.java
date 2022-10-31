package com.sgtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpkart {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		mouseMovements();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void mouseMovements()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='xtXmba']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='_2I9KP_']"));
			Actions oMouse=new Actions(oBrowser);
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Formal Shrits")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

