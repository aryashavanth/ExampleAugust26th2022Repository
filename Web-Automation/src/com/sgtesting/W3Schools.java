
package com.sgtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//clickOnMenu();
		clickOntutorials();
		relativeXPathUsingTagNameWithAttributeName();
	
		
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
		oBrowser.get("https://www.w3schools.com/");	
		Thread.sleep(5000);
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
}
private static void clickOnMenu()
{
	try
	{
	oBrowser.findElement(By.xpath("//*[@id=\'navbtn_menu\']")).click();
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
}
private static void clickOntutorials()
{
	try
	{
	oBrowser.findElement(By.xpath("//*[@id=\"navbtn_tutorials\"]")).click();
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
}
private static void relativeXPathUsingTagNameWithAttributeName()
{
	try
	{
		//Find out numbers of Link Available
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		int linkscount=olinks.size();
		System.out.println("# of Links :"+linkscount);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}


