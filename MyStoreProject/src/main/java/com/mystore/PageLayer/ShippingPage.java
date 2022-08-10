package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.TestBase;

public class ShippingPage extends TestBase{
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement terms;
	
	public void clickOnCheckBox() {
		terms.click();
	}
	
	@FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
	private WebElement proceed_to_chkout_btn;
	
	public void clickOnProceedToCheckoutButton() {
		proceed_to_chkout_btn.click();
	}

}
