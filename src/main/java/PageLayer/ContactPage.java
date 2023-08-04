package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.DropDown;
import UtilsLayer.UtilsClass;

public class ContactPage extends BaseClass {
	
	@FindBy(xpath = "//span[text()='Contacts']")
	private WebElement clickContactLink;

	@FindBy(xpath = "(//i[@class='plus inverted icon'])[2]")
	private WebElement Add;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='middle_name']")
	private WebElement middlename;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//div[@name='category']")
	private List<WebElement> category;

	@FindBy(xpath = "//div[@name='status']")
	private List<WebElement> status;

	@FindBy(xpath = "(//button[@class='ui linkedin button'])[1]")
	private WebElement save;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContactPageLink() {
		UtilsClass.click(clickContactLink);
	}

	public String validateContactPageTitle() {

		return driver.getTitle();
	}

	public String  validateContactPageurl() {

		return driver.getCurrentUrl();

	}

	public void add() {

		UtilsClass.click(Add);
	}

	public void enterData(String Fname, String Mname, String Lname, String Cat, String Status) {
		UtilsClass.sendKeys(firstname, Fname);
		UtilsClass.sendKeys(middlename, Mname);
		UtilsClass.sendKeys(lastname, Lname);
		DropDown.handleDropDown(category, Cat);
		DropDown.handleDropDown(status, Status);
	}

	public void save() {
		UtilsClass.click(save);

	}

}
