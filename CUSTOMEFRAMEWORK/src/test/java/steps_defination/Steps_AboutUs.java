package steps_defination;

import com.po.AboutUsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_AboutUs {

	AboutUsPage aboutUsPage = new AboutUsPage();

	@When("user click on about us link")
	public void user_click_on_about_us_link() {
		aboutUsPage.clickonAboutus();

	}

	@Then("verify the About us page is opened")
	public void verify_the_about_us_page_is_opened() {
		aboutUsPage.clickonAboutus();

	}

}
