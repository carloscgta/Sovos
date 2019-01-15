package pt.com.unbabel.annotation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import pt.com.unbabel.utils.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/pt/com/unbabel/annotation",//path for the feature
				strict = false, //If you have unmapped steps the execution should not fail
				monochrome = true, // view  the result in the console 
				glue = {"pt.com.unbabel.annotation"}) //Finding the steps

public class Runner {

	@BeforeClass
	public static void iniciaDriver() throws Exception {
		Driver.setUpWebDriver();
	}
	
	@AfterClass
	public static void finalizaDriver() throws Throwable {
		Driver.finaliza();
	}
	
}
