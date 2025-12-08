package com.po;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.Webbase;

public class ContactUsPage extends Webbase {

	public ContactUsPage() {
		PageFactory.initElements(getdriver(), this);
	}

	@FindBy(xpath = "//*[text() = 'Contact Us']")
	WebElement contactus;

	@FindBy(xpath = "//*[@name = 'name']")
	WebElement entername;

	@FindBy(xpath = "//*[@name = 'email']")
	WebElement enteremail;

	@FindBy(xpath = "//*[@id= 'input-enquiry']")
	WebElement message;

	@FindBy(xpath = "//*[@value= 'Submit']")
	WebElement submit;

	public void clickOnContactUs() {
		contactus.click();
	}

	public void verifyContactUs() {
		Assert.assertEquals(getdriver().getTitle(), "Contact Us");
	}

	public void enterName() {
		entername.click();
		entername.sendKeys("Harsh");
	}

	public void enterEmail() {
		enteremail.click();
		enteremail.sendKeys("harsh123@gmail.com");
	}

	public void enterMessage() {
		message.click();
		message.sendKeys("inquiry for purchase new laptop");
	}

	public void clickonSubmit() {
		submit.click();
	}

}
