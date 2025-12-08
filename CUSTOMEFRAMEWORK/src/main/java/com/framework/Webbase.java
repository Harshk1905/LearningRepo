package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webbase {
	private static WebDriver driver;
	
	public void createDriver(String browsername) {
		if (browsername.toLowerCase().contains("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.toLowerCase().contains("edge")) {
			driver = new EdgeDriver();
		}
		else if(browsername.toLowerCase().contains("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please enter valid browser name");
		}
	}
	
	public static WebDriver getdriver() {
		return driver;
		
	}
	
	public void openWebsite(String url) {
		getdriver().manage().window().maximize();
		getdriver().get(url);
	}
	
	public void closeBrowser() {
		getdriver().quit();
	}

}
