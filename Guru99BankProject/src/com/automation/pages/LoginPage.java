package com.automation.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public  String NAME_USERNAME="uid";
	public  String NAME_PASSWORD="password";
	public  String NAME_LOGINBUTTON="btnLogin";
	public String PAGETITLE_LOGINPAGE="Guru99 Bank Home Page";
	public String PAGETITLE_HOMEPAGE="Guru99 Bank Manager HomePage";

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

		
		public void enterAdminUsername(String uname,String value) throws IOException{
			driver.findElement(By.name(uname)).sendKeys(value);
		}
		public void enterAdminpassword(String pass,String value)throws IOException{
			driver.findElement(By.name(pass)).sendKeys(value);
		}
		public void clickOnLoginButton(String ButtonName) throws IOException{
			driver.findElement(By.name(ButtonName)).click();
		}
		public void ClickOnLeftNavigationPanel(By by) {
			driver.findElement(by).click();
		}
}
