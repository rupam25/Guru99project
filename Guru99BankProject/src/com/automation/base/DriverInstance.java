package com.automation.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.automation.utility.Utility;
public class DriverInstance {
	public WebDriver driver;
	@BeforeMethod
public void initiateDriverInstance() throws Exception {
	if(Utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("chrome"))
	{System.setProperty("webdriver.chrome.driver","./Driver/chromeDriver.exe");
		driver =new ChromeDriver();
	}
	else if(Utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("firefox"))
		{System.setProperty("webdriver.gecko.driver","./Driver/geckoDriver.exe");

		driver =new FirefoxDriver();
	}
	else
	{	System.setProperty("webdriver.chrome.driver","./Driver/chromeDriver.exe");

		driver =new ChromeDriver();
	}
	driver.get(Utility.fetchpropertyvalue("applicationURL").toString());
}
@AfterMethod
public void closeDriverInstance() {
	driver.quit();
}
}