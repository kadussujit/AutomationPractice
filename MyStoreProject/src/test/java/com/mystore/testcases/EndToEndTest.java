package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.Base.TestBase;


public class EndToEndTest extends TestBase{
	
	@Test
	public void endToEndTest() {
		index.enterInSeachbox("t-shirt");
		index.clickOnSearchButton();
		searchResult.clickOnProduct();
		addcart.selectSizeOfProduct("M");
		addcart.ClickOnAddToCartButton();
		addcart.clickOnProceedToCheckoutButton();
		orderSummary.clickOnProceedToCheckout();
		login.enterUsername("admin@xyz.com");
		login.enterPassword("admin@123");
		login.clickOnSignInButton();
		addressPage.clickOnCheckoutButton();
		shippingPage.clickOnCheckBox();
		shippingPage.clickOnProceedToCheckoutButton();
		paymentPage.clickOnBankWire();
		confirmOrder.clickOnConfirmOrder();
		String actualMsg=confirmOrder.validateOrder();
		String expectedMsg = "Your order on My Store is complete.";
		Assert.assertEquals(expectedMsg, actualMsg);
		
	}

}
