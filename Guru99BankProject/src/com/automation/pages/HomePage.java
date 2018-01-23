package com.automation.pages;

public class HomePage {
	public static String LABEL_NEWCUSTOMER="New Customer";
	public static String XpathofLeftpanelElement(String labelName) {
		return ".//a[text()='"+labelName+"']";
		}
}
