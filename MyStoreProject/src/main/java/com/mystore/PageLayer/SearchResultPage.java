package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.TestBase;

public class SearchResultPage extends TestBase{
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@id=\"center_column\"]//img)[1]")
	private WebElement product_result;
	
	public boolean isProductAvailable() {
		return product_result.isDisplayed();
	}
	
	public AddToCartPage clickOnProduct() {
		product_result.click();
		return new AddToCartPage();
	}

}
