package com.po;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.Webbase;

public class AboutUsPage extends Webbase {

	public AboutUsPage() {
		PageFactory.initElements(getdriver(), this);
	}

	@FindBy(xpath = "//*[text()= 'About Us']")
	private WebElement aboutus;

	public void clickonAboutus() {
		aboutus.click();
	}

	public void verifyAboutUsOpened() {
		Assert.assertEquals(getdriver().getTitle(), "About Us");
	}

}
