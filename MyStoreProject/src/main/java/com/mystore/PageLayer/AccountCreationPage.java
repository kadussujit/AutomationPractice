package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.TestBase;

public class AccountCreationPage extends TestBase {
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Create an account')]")
	private WebElement acc_form_name;
	
	public boolean displayAccountCreationFormName() {
		return acc_form_name.isDisplayed();
	}

}
