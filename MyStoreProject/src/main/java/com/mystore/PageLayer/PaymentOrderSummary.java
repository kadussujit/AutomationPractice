package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.TestBase;

public class PaymentOrderSummary extends TestBase {
	
	public PaymentOrderSummary() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button/span[contains(text(),'I confirm my order')]")
	private WebElement confirm_myOrder;
	
	public void clickOnConfirmMyOrder() {
		confirm_myOrder.click();
	}

}
