package pt.com.unbabel.annotation;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.com.unbabel.pageobject.AnnotationTool;
import pt.com.unbabel.pageobject.LoginPage;
import pt.com.unbabel.utils.Driver;

public class Business {

	private LoginPage login;
	private AnnotationTool cadastro;
	private static WebDriverWait wait;

	public Business() {

		login = new LoginPage();
		cadastro = new AnnotationTool();
		wait = new WebDriverWait(Driver.getDriver(), 10);
	}

	public void loginAnnotationTool(String email, String password) {
		
	
		wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(login.getbtnDoLoginHome())));
		
		
		Driver.getDriver().findElement(login.getbtnDoLoginHome()).click();
		

		Driver.getDriver().findElement(login.getinputUserName()).sendKeys(email);

		Driver.getDriver().findElement(login.getinputtxtPassword()).sendKeys(password);

		Driver.getDriver().findElement(login.getbtnDoLogin()).click();
	}


}
