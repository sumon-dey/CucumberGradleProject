package com.cucumber.stepDefinition;

import java.util.List;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CommonSteps {

	/* Here the regular expression \"([^\"]*)\" is known as the capture group */
	@Given("^user opens the \"([^\"]*)\" browser$")
	public void user_opens_the_browser(String browserName) throws Throwable {
		System.out.println("The user opened the browser: " + browserName);
		System.out.println("The user is: " + System.getProperty("name"));
	}

	@And("^user is using the application \"([^\"]*)\"$")
	public void user_using_the_application(String applicationName) throws Throwable {
		System.out.println("The user is using the application: " + applicationName);
	}

	@And("^user opens the URL \"([^\"]*)\" in the browser$")
	public void user_opens_the_URL_in_the_browser(String url) throws Throwable {
		System.out.println("The url opened in the browser is: " + url);
	}

	@And("^user enters the text \"([^\"]*)\" in the textbox \"([^\"]*)\"$")
	public void user_enters_the_text_in_textbox(String textToEnter, String textBoxIdentifier) throws Throwable {
		System.out.println("The user has entered the text " + textToEnter + " in the textbox " + textBoxIdentifier);
	}

	@And("^user clicks on the \"([^\"]*)\" button$")
	public void user_clicks_on_the_button(String buttonIdentifier) throws Throwable {
		System.out.println("The user has clicked on the button: " + buttonIdentifier);
	}

	@And("^user clicks on the \"([^\"]*)\" radiobutton$")
	public void user_clicks_on_the_radiobutton(String radiobuttonIdentifier) throws Throwable {
		System.out.println("The user has clicked on the radiobutton: " + radiobuttonIdentifier);
	}

	@And("^user (checks|unchecks) the checkbox \"([^\"]*)\"$")
	public void user_checks_unchecks_the_checkbox(String decision, String checkboxIdentifier) throws Throwable {
		System.out.println("The user " + decision + " the checkbox " + checkboxIdentifier);
	}

	@And("^user validates the current url as \"([^\"]*)\"$")
	public void user_validates_current_url(String currentURL) throws Throwable {
		System.out.println("The current url is: " + currentURL);
	}

	@And("^user validates the below elements$")
	public void user_validates_elements(List<String> elementsTable) throws Throwable {
		System.out.println("The elements to be validated are: ");
		for (String element : elementsTable) {
			System.out.println(element);
		}
	}

}
