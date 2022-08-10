package com.mystore.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.mystore.Base.TestBase;

public class HomePageTest extends TestBase{

	@Test
	public void wishListTest() {
		index.clickOnSignIn();
		login.enterUsername("admin@xyz.com");
		login.enterPassword("admin@123");
		login.clickOnSignInButton();
		boolean result = homepage.displayWishList();
		Assert.assertTrue(result);
	}
	
	@Test
	public void oderAndHistoryTest() {
		index.clickOnSignIn();
		login.enterUsername("admin@xyz.com");
		login.enterPassword("admin@123");
		login.clickOnSignInButton();
		boolean result = homepage.displayOrderHistory();
		Assert.assertTrue(result);
	}
}
