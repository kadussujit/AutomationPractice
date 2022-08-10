package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.Base.TestBase;

public class AddToCartPageTest extends TestBase{
	
	@Test
	public void addToCartTest() {
		index.enterInSeachbox("t-shirt");
		index.clickOnSearchButton();
		searchResult.clickOnProduct();
		addcart.selectSizeOfProduct("M");
		addcart.ClickOnAddToCartButton();
		boolean result = addcart.validateProductAddedToCart();
		Assert.assertTrue(result);
	}

}
