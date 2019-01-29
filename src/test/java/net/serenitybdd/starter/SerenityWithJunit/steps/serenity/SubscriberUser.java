package net.serenitybdd.starter.SerenityWithJunit.steps.serenity;

import java.util.List;

import org.junit.Assert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.starter.SerenityWithJunit.pages.HomePage;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;

public class SubscriberUser extends ScenarioSteps  {
	
	

	HomePage homepage;

	@Step
	public void is_on_the_home_page() {
		homepage.open();
	}

	@Step
	public void enter_subcriber_email(String email) {
		homepage.enter_subcriber_email(email);
	}

	@Step
	public void click_subscriber_button() {
		homepage.click_subscriber_button();
	}

	@Step ("#User enter a subscriber email {0}")
	public void enter_an_invalid_email(String email) {
		enter_subcriber_email(email);
		click_subscriber_button();
		Serenity.setSessionVariable("email").to(email);
	}

	@Step
	public void observe_the_error_message(String expectMessage) {
		System.out.println("The email is: " + Serenity.sessionVariableCalled("email").toString());
		Assert.assertTrue(expectMessage.equalsIgnoreCase(homepage.get_error_content_on_form()));
	}

}
