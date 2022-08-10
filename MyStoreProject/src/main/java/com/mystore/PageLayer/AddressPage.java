package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.TestBase;

public class AddressPage extends TestBase{
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
	private WebElement proceed_to_chkout_btn;
	
	public void clickOnCheckoutButton() {
		proceed_to_chkout_btn.click();
	}

}
