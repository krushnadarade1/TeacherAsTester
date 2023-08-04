package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.When;

public class ContactPageTest extends BaseClass {
	public static ContactPage cp;

	@When("user click on contact page link")
	public void user_click_on_contact_page_link() {
		cp = new ContactPage();

		cp.clickOnContactPageLink();
	}

	@When("user is on Home Page validate Contact page Title")
	public void user_is_on_home_page_validate_contact_page_title() {

		Assert.assertEquals(cp.validateContactPageTitle().equalsIgnoreCase("Cogmento Crm"), true);

	}

	@When("validate Contact page Url")
	public void validate_contact_page_url() {
		Assert.assertEquals(cp.validateContactPageurl().contains("contacts"), true);

	}

	@When("click on add button")
	public void click_on_add_button() {
		cp.add();

	}

	@When("enter firstname lastname middlename and select catogory and select status")
	public void enter_firstname_lastname_middlename_and_select_catogory_and_select_status() {
		cp.enterData("Kiran", "KK", "Kumar", "Customer", "Active");

	}

	@When("click on save button")
	public void click_on_save_button() {
		cp.save();

	}
}
