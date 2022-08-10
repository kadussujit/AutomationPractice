/**
 * 
 */
package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.TestBase;

/**
 * @author SUJIT
 *
 */
public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement username_email_id;
	
	public void enterUsername(String username) {
		username_email_id.sendKeys(username);
	}
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement user_password;
	
	public void enterPassword(String password) {
		user_password.sendKeys(password);
	}
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement signin_btn;
	
	public void clickOnSignInButton() {
		signin_btn.click();
	}
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement signup_email;
	
	public void enterSignUpEmail(String userEmailID) {
		signup_email.sendKeys(userEmailID);
	}
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement create_account_btn;
	
	public void clickOnCreateAccount() {
		create_account_btn.click();
	}
	
	
	
	

}
