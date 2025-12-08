package com.po;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.Webbase;

public class LoginPage extends Webbase {

	public LoginPage() {
		PageFactory.initElements(getdriver(), this);
	}

	@FindBy(xpath = "//*[@title ='My Account']")
	private WebElement myaccountlink;

	@FindBy(xpath = "//*[text() = 'Login']")
	private WebElement loginlink;

	@FindBy(css = "input[name='email']")
	private WebElement enteremail;

	@FindBy(css = "input[name='password']")
	private WebElement enterpass;

	@FindBy(xpath = "//*[@value = 'Login']")
	private WebElement submitbutton;

	public void clickonMyAccount() {
		myaccountlink.click();
	}

	public void clickonLogin() {
		loginlink.click();
	}

	public void verifyLoginPage() {
		Assert.assertEquals(getdriver().getTitle(), "Account Login");
	}

	public void enterEmailid(String email) {
		enteremail.click();
		enteremail.sendKeys(email);
	}

	public void enterPassword(String password) {
		enterpass.click();
		enterpass.sendKeys(password);
	}

	public void clickonLoginbutton() {
		submitbutton.click();

	}

	public void verifyUserisLogedin() {
		Assert.assertEquals(getdriver().getTitle(), "My Account");
	}

}
