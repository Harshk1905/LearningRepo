package steps_defination;

import com.framework.Webbase;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class Steps_Background {
	Webbase webbase = new Webbase();
	
	@Given("user open {string} browser and enter {string}")
	public void user_open_browser_and_enter(String browser, String url) {
		webbase.createDriver(browser);
		webbase.openWebsite(url);
	    
	}
	
	@After
	public void closeBrowser() {
		webbase.closeBrowser();
	}

}
