package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class invoicesearch extends SeleniumBase{
	
	public invoicesearch enterid() {
		clearAndType(locateElement("id", "vendorTaxID"), "DE763212");
		return this;
	}
	
	public invoicenumber clickLogin() {
		click(locateElement("id","buttonSearch"));
		return new invoicenumber();
	}


}
