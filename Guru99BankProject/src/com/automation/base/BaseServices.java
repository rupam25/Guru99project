package com.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.automation.pages.HomePage;

public class BaseServices {
public static WebElement getLeftNavigationPanelElementByXpath(WebDriver driver,String elementName) {
			WebElement element=driver.findElement(By.xpath(HomePage.XpathofLeftpanelElement(elementName)));
			return element;
		
	}
	

	
}
