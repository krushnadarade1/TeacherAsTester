package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

public class DropDown {
	
	public static void handleDropDown(List<WebElement> ls,String Value) {
		for(WebElement abc: ls) {
			if(abc.getText().equals(Value)) {
				abc.click();
				break;
			}
		}
		
	}

}
