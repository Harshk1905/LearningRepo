package steps_defination;

import com.po.ContactUsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_ContactUs {
	ContactUsPage contactUsPage = new ContactUsPage();

	@When("user click on contact us link")
	public void user_click_on_contact_us_link() {
		contactUsPage.clickOnContactUs();

	}

	@Then("verify that contact us page is open")
	public void verify_that_contact_us_page_is_open() {
		contactUsPage.verifyContactUs();

	}

	@When("user  fill the contact us form")
	public void user_fill_the_contact_us_form() {
		contactUsPage.enterName();
		contactUsPage.enterEmail();
		contactUsPage.enterMessage();

	}

	@When("click on submit button")
	public void click_on_submit_button() {
		contactUsPage.clickonSubmit();
	}

}
