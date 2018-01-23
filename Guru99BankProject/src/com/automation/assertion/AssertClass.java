package com.automation.assertion;

import org.openqa.selenium.WebDriver;

/*
 * 
 */
public class AssertClass {
	public static boolean validatePageTitle(WebDriver driver, String expTitle) {
		boolean flag = false;
		if (driver.getTitle().equalsIgnoreCase(expTitle)) {
			flag = true;
			System.out.println("login successsful with valid userid & password");
			return flag;
		} else {
			System.out.println("login unsuccesssful with invalid userid & password");
			return flag;
		}

	}
}
