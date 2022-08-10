package com.mystore.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.mystore.Base.TestBase;

public class SearchResultPageTest extends TestBase{
	
	@Test
	public void productAvailabilityTest() {
		index.enterInSeachbox("t-shirt");
		index.clickOnSearchButton();
		boolean result = searchResult.isProductAvailable();
		Assert.assertTrue(result);
	}

}
