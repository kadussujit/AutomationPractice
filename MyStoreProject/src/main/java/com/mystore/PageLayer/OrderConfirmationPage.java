package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.Base.TestBase;

public class OrderConfirmationPage extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver,15);
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button/span[contains(text(),'I confirm my order')]")
	private WebElement confirm_order;
	
	public void clickOnConfirmOrder() {
		confirm_order.click();
	}
	
	@FindBy(xpath="//div/p[@class='cheque-indent']")
	private WebElement order_validation;
	
	public String validateOrder() {
		wait.until(ExpectedConditions.visibilityOf(order_validation));
		return order_validation.getText();
	}
	

}
