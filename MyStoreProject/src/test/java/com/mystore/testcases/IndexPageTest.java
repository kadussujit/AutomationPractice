package com.mystore.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.mystore.Base.TestBase;

public class IndexPageTest extends TestBase {

	@Test
	public void verifyLogoTest() {
		boolean result = index.verifyLogo();
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyPageTitle() {
		String ExpTitle = driver.getTitle();
		String ActTitle = "My Store";
		Assert.assertEquals(ExpTitle, ActTitle);
	}

}
