package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.Base.TestBase;

public class OrderSummary extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver,15);
	
	public OrderSummary() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[@class='cart_unit']/span/span")
	private WebElement unit_price;
	
	public double getUnitPrice() {
		wait.until(ExpectedConditions.visibilityOf(unit_price));
		String unit = unit_price.getText();
		String unitPrice = unit.replaceAll("[^a-zA-Z0-9]", "");
		double finalUnitPrice = Double.parseDouble(unitPrice);
		return finalUnitPrice/100;
	}
	
	@FindBy(xpath="//span[@id='total_price']")
	private WebElement total_price;
	
	public double getTotalPrice() {
		String total = total_price.getText();
		String totalPrice = total.replaceAll("[^a-zA-Z0-9]", "");
		double finalTotalPrice = Double.parseDouble(totalPrice);
		return finalTotalPrice/100;
	}
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed_to_chkout_btn;
	
	public void clickOnProceedToCheckout() {
		proceed_to_chkout_btn.click();
	}

}
