package com.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonServices extends BaseServices{
	public  static void  ClickOnLeftPanelElement(WebDriver driver,String elementName) {
		System.out.print("1done");
		
		BaseServices.getLeftNavigationPanelElementByXpath(driver, elementName).click();
	}
}

