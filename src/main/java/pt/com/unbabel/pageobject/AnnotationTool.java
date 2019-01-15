package pt.com.unbabel.pageobject;

import org.openqa.selenium.By;

public class AnnotationTool {

	private By btnAdd = By.xpath("//*[@id=\"content\"]/div/form/button");
	private By msgCadastro = By.xpath("/html/body/div[3]/div/h4");      

	public By getbtnAdd() {
		return btnAdd;
	}

	public By gettxtFirstName() {
		return txtFirstName;
	}

	public By gettxtLastName() {
		return txtLastName;
	}

	public By gettxtEmail() {
		return txtEmail;
	}

	public By gettxtPassword() {
		return txtPassword;
	}

	public By getlCountry() {
		return lCountry;
	}
	

	public By getbtnSubmit() {
		return btnSubmit;
	}

	public By msgCadastro() {
		return msgCadastro;
	}

}
