package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.Base.TestBase;

public class OrderSummaryTest extends TestBase{
	
	@Test
	public void verifyTotalPrice() {
		index.enterInSeachbox("t-shirt");
		index.clickOnSearchButton();
		searchResult.clickOnProduct();
		addcart.selectSizeOfProduct("M");
		addcart.ClickOnAddToCartButton();
		addcart.clickOnProceedToCheckoutButton();
		double unitPrice = orderSummary.getUnitPrice();
		double totalPrice = orderSummary.getTotalPrice();
		double totalExpectedPrice = (unitPrice*1)+2;
		Assert.assertEquals(totalPrice, totalExpectedPrice);
		
	}

}
