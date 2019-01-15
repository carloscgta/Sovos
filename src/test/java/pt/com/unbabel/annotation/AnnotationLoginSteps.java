package pt.com.unbabel.annotation;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class AnnotationLoginSteps {
	
	private Business page;

	public AnnotationLoginSteps() {
		page = new Business();
	}
	
	@Given("^I am logged into the Annotation tool \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void i_am_logged_into_the_Annotation_tool_e_senha(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		page.loginAnnotationTool("emanuel+annotator6", "carlos@unbabel");
		
	    throw new PendingException();
	}

	@When("^I select one test for perform the annotation$")
	public void i_select_one_test_for_perform_the_annotation() throws Throwable {

	    throw new PendingException();
	}

	@When("^Select the Sorty by radio$")
	public void select_the_Sorty_by_radio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^select the text to perform the annotation$")
	public void select_the_text_to_perform_the_annotation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Click in Annotate$")
	public void click_in_Annotate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Select the Error type$")
	public void select_the_Error_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Click in Finish or Report and choose Finish$")
	public void click_in_Finish_or_Report_and_choose_Finish() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^set the task Comment text in the text field$")
	public void set_the_task_Comment_text_in_the_text_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Click in Finish button$")
	public void click_in_Finish_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the Annotation is finished$")
	public void the_Annotation_is_finished() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
