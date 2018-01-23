package com.automation.testcases;
import java.io.IOException;
import org.testng.annotations.Test;
import com.automation.pages.LoginPage;
import com.automation.utility.Utility;
import com.automation.assertion.AssertClass;
import com.automation.base.DriverInstance;

public class LoginWithValidCredentials extends DriverInstance {
@Test
public void validateLoginfunctionality() throws IOException{
	LoginPage login=new LoginPage(driver);
	login.enterAdminpassword(login.NAME_USERNAME,Utility.fetchpropertyvalue("admin_username") );
	login.enterAdminpassword(login.NAME_PASSWORD, Utility.fetchpropertyvalue("admin_password"));
	login.clickOnLoginButton(login.NAME_LOGINBUTTON);
	AssertClass.validatePageTitle(driver, login.PAGETITLE_HOMEPAGE);
}
}
