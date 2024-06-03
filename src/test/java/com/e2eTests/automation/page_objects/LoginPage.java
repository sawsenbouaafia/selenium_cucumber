package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.Setup;

public class LoginPage {

	/* Retrieve element */

	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnlogin;
	
	@FindBy(how = How.TAG_NAME, using = "h1")
	private static WebElement text;
	
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		
	}
	
	/* Create method getter */

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;

	}

	public static WebElement getBtnLogin() {
		return btnlogin;
	}
	public static WebElement getTitlePage() {
		return text;
}
}
