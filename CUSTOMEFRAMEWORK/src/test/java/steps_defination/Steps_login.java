package steps_defination;

import com.po.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_login {

	LoginPage loginPage = new LoginPage();

	@When("user click on my account link")
	public void user_click_on_my_account_link() {
		loginPage.clickonMyAccount();

	}

	@When("user click on login link")
	public void user_click_on_login_link() {
		loginPage.clickonLogin();

	}

	@Then("verify that login page should open")
	public void verify_that_login_page_should_open() {
		loginPage.verifyLoginPage();
	}

	@When("user enter {string} in email textbox")
	public void user_enter_in_email_textbox(String email) {
		loginPage.enterEmailid(email);

	}

	@When("user enter {string} in password textbox")
	public void user_enter_in_password_textbox(String password) {
		loginPage.enterPassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickonLoginbutton();

	}

	@Then("verify that user should be able to login")
	public void verify_that_user_should_be_able_to_login() {
		loginPage.verifyUserisLogedin();
	}

}
