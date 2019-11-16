package com.leafBot.pages;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	public invoicesearch clickLogout() {
		MouseHover(locateElement("xpath","(//button[contains(@class,'btn btn-default')])[6]"));
		click(locateElement("link","Search for Invoice"));
		
		//driver.findElementByLinkText("Search for Invoice").click();
		return new invoicesearch();
	}

}
