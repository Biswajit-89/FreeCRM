package com.FreeCRM.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{

	public static WebDriver startApplication(WebDriver driver , String browserName, String AppURL)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
			driver = new ChromeDriver();
			
		}    
		else if (browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.Firefox.driver", "./drivers/geckodriver.exe" );
			driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		
		else
		{
			System.out.println("we do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(AppURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
