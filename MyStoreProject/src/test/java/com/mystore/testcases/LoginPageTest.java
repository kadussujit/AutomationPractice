package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.mystore.Base.TestBase;


public class LoginPageTest extends TestBase{
	
	
	@Test(dataProvider = "loginData")
	public void loginTest(String uName, String pswd) {
		index.clickOnSignIn();
		login.enterUsername(uName);
		login.enterPassword(pswd);
		login.clickOnSignInButton();
		String acutalURL = driver.getTitle();
		String expURL = "My account - My Store";
		Assert.assertEquals(acutalURL, expURL);
	}
	
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException {
		ReadData read = new ReadData();
		int r = read.getRowCount("Sheet1");
		int c = read.getCellCount("Sheet1", 1);
		
		String loginData[][] = new String [r][c];
		
		for(int i=1;i<=r;i++)
		{
			for(int j=0;j<c;j++)
			{
				loginData[i-1][j]=read.readDataFromExcel("Sheet1", i, j);
			}
		}
		
		return loginData;
		
	}
	
	@Test
	public void verifyCreateAccountTest() {
		index.clickOnSignIn();
		login.enterSignUpEmail("loc@kargil.com");
		login.clickOnCreateAccount();
		boolean result = acc.displayAccountCreationFormName();
		Assert.assertTrue(result);
	}

}
