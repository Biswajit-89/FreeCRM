package com.FreeCRM.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.FreeCRM.genericlib.BrowserFactory;

public class LoginTest 
{

	WebDriver driver;
	
	@Test
	public void loginApp()
	{
		driver= BrowserFactory.startApplication(driver, "chrome", "https://freecrm.com/");
			
	}
	

}
