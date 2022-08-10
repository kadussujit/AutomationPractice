package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.Base.TestBase;

public class AddToCartPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, 15);

	// Constructor ---- Initialization of objects/ web elements
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

	// Select quantity of product
	@FindBy(xpath = "//input[@id='quantity_wanted']")
	private WebElement quantity;

	public void addQuantity(String qty) {
		quantity.sendKeys(qty);
	}

	// Select size of the product S/M/L
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement product_size;

	public void selectSizeOfProduct(String size) {
		Select s = new Select(product_size);
		s.selectByVisibleText(size);
	}

	// Click on Add to cart button
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	private WebElement add_to_cart_btn;

	public void ClickOnAddToCartButton() {
		add_to_cart_btn.click();
	}

	// Product added to cart message
	@FindBy(xpath = "//*[@id=\"layer_cart\"]//h2/i")
	private WebElement added_to_cart_msg;

	public boolean validateProductAddedToCart() {
		wait.until(ExpectedConditions.visibilityOf(added_to_cart_msg));
		return added_to_cart_msg.isDisplayed();
	}
	
	//Proceed to checkout
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceed_to_checkout_btn;
	
	public void clickOnProceedToCheckoutButton() {
		wait.until(ExpectedConditions.visibilityOf(proceed_to_checkout_btn));
		proceed_to_checkout_btn.click();
	}

}
