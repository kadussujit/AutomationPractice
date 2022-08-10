package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.TestBase;

public class PaymentPage extends TestBase {

	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class=\"bankwire\"]")
	private WebElement bankwire_method;
	
	public void clickOnBankWire() {
		bankwire_method.click();
	}
	
	@FindBy(xpath="//a[@class=\"cheque\"]")
	private WebElement paybycheque_method;
	
	public void clickOnPayByCheque() {
		paybycheque_method.click();
	}
}
