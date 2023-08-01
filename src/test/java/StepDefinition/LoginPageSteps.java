package StepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {
	@Given("User on login page")
	public void user_on_login_page() {
		BaseClass.initialization();
	}

	@When("User enter valid username and password and click on login button")
	public void user_enter_valid_username_and_password_and_click_on_login_button() {
		LoginPage page = new LoginPage();
		page.loginPageFunctionality(prop.getProperty("username"), prop.getProperty("password"));

	}
	@AfterStep
	public static void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			byte[]f=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());
		}
		else
		{
			byte[]f=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());
		}
	}
	
	
			
		
	}


