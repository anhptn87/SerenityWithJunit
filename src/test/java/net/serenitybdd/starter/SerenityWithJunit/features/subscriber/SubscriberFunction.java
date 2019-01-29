package net.serenitybdd.starter.SerenityWithJunit.features.subscriber;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.starter.SerenityWithJunit.steps.serenity.EndUserSteps;
import net.serenitybdd.starter.SerenityWithJunit.steps.serenity.SubscriberUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.junit.annotations.TestData;
@Narrative(text="this is subscriber function. narrative")
//@RunWith(SerenityParameterizedRunner.class)
@RunWith(SerenityRunner.class)
public class SubscriberFunction {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public SubscriberUser anna;
	
	
	/*@TestData   
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //{"a"},
                //{" "},
                {"anhptn@"},
                {"anhptn@qa"},
                {"anh@qa..team"}
        });
    }
    private String email;
    
    public SubscriberFunction(String _email) {
    	this.email = _email;
    }*/
	@Test
	@WithTag(name="anhptn test")
	public void enter_the_invalid_email () {
		//given
		anna.is_on_the_home_page();
		//when
//		anna.enter_an_invalid_email(email);
		anna.enter_an_invalid_email("anh");
		//then
		anna.observe_the_error_message("* Email không đúng định dạng");
	}
}
