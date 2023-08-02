package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//div[@class='header item']")
	private WebElement logo;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean logo()
	{
		return logo.isDisplayed();
	}
	
	public String getTitle()
	{
		return driver.getTitle();	
	}
	
	public String currentUrl()
	{
		return driver.getCurrentUrl();
	}

}
