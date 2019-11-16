package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;

public class invoicenumber extends SeleniumBase {
	
	public invoicenumber getid() {
		//clearAndType(locateElement("id", "vendorTaxID"), "DE763212");
		List<WebElement> itsupp = driver.findElementsByXPath("//td[text()='IT Support']/preceding::td[2]");

		for(int i=0;i<itsupp.size();i++)
		{
			
			System.out.println(itsupp.get(i).getText());
			
		}

		
		
		//getElementText(locateElement("id",""))
		return this;
	}

}
