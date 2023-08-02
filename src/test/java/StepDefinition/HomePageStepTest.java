package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStepTest extends BaseClass{

	public static HomePage home;
	@When("User is on home page validate home page logo")
	public void user_is_on_home_page_validate_home_page_logo() 
	{
	   home = new HomePage(); 
	   boolean actuallogo = home.logo();
	   Assert.assertEquals(actuallogo, true);
	}

	@When("Validate home page Title")
	public void validate_home_page_title()
	{
	 Assert.assertEquals(home.getTitle().equalsIgnoreCase("Cogmento CRM"), true);
	}

	@When("Validate home page Url")
	public void validate_home_page_url() 
	{
		 Assert.assertEquals(home.currentUrl().contains("cogmento"), true);
	}
}
