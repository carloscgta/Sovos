package pt.com.unbabel.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Driver {

	public static WebDriver driver = null;
	
	private static final String HOME_PAG = "https://staging.annotation.tools.unbabel.com/";
	
	//Class responsible for creating the Driver
	private static WebDriver setDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\Chrome\\chromedriver.exe");
		return driver = new ChromeDriver();
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = setDriver();
		}		
		return driver;
	}
	
	//Class responsible for starting the Google Chrome Driver and log in to the homepage
	public static void setUpWebDriver() {
		
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().get(HOME_PAG);
	}

	//Method to shut down the Driver after execution
	public static void finaliza() {
			getDriver().quit();
			 
		}
	}