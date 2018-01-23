package com.automation.testcases;

import java.io.IOException;


import com.automation.datagenerator.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.base.CommonServices;
import com.automation.base.DriverInstance;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utility.Utility;
import org.openqa.selenium.WebDriver;

public class AddNewCustomer extends DriverInstance {
	 @Test(dataProvider="Excel",dataProviderClass=dataGenerator.class)
	public void AddCustomer(String name,String gender) throws InterruptedException, IOException
	{
		LoginPage login=new LoginPage(driver);
		login.enterAdminpassword(login.NAME_USERNAME,Utility.fetchpropertyvalue("admin_username") );
		login.enterAdminpassword(login.NAME_PASSWORD, Utility.fetchpropertyvalue("admin_password"));
		login.clickOnLoginButton(login.NAME_LOGINBUTTON);
		Thread.sleep(4000);
		CommonServices.ClickOnLeftPanelElement(driver,HomePage.LABEL_NEWCUSTOMER );
		driver.findElement(By.name("name")).sendKeys(name);
	
		
	}

}
