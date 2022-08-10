package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.TestBase;

public class HomePage extends TestBase{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Order history and details')]")
	private WebElement order_history;
	
	public boolean displayOrderHistory() {
		return order_history.isDisplayed();
	}
	
	@FindBy(xpath="//span[contains(text(),'My credit slips')]")
	private WebElement credit_slip;
	
	public boolean displayMyCreditSlips() {
		return credit_slip.isDisplayed();
	}
	
	@FindBy(xpath="//span[contains(text(),'My addresses')]")
	private WebElement addresses;
	
	public boolean displayMyAddresses() {
		return addresses.isDisplayed();
	}
	
	@FindBy(xpath="//span[contains(text(),'My personal information')]")
	private WebElement personal_info;
	
	public void clickOnMyPersonalInformation() {
		personal_info.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'My wishlists')]")
	private WebElement my_wishlists;
	
	public boolean displayWishList() {
		return my_wishlists.isDisplayed();
	}
	
	@FindBy(xpath="(//a[@class='btn btn-default button button-small'])[2]")
	private WebElement home_btn;
	
	public void clickOnHomeButton() {
		home_btn.click();
	}
}
