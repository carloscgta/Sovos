package pt.com.unbabel.pageobject;

import org.openqa.selenium.By;

public class LoginPage {
	
private By btnDoLogin = By.xpath("//button[@class='unbabel-btn-round unbabel-blue btn-block']");



private By btnDoLoginHome = By.xpath("//button[@class='btn-round btn-white-home']");
	
	private By inputUserName = By.xpath("//input[@id='username']");
	
	private By inputtxtPassword = By.xpath("//input[@id='password']");
	

	public By getbtnDoLogin() {
		return btnDoLogin;
	}

	public By getinputUserName() {
		return inputUserName;
	}

	public By getinputtxtPassword() {
		return inputtxtPassword;
	}
	
	public By getbtnDoLoginHome() {
		return btnDoLoginHome;
	}

}
