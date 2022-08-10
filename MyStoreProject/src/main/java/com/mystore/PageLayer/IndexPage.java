package com.mystore.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystore.Base.TestBase;

public class IndexPage extends TestBase{
	
	public IndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement sign_in;
	
	public LoginPage clickOnSignIn() {
		sign_in.click();
		return new LoginPage();
	}
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement MyStore_logo;
	
	public boolean verifyLogo() {
		boolean expected = MyStore_logo.isDisplayed();
		return expected;
	}
	
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement search_box;
	
	public void enterInSeachbox(String search) {
		search_box.clear();
		search_box.sendKeys(search);
	}
	
	@FindBy(xpath="//button[@class='btn btn-default button-search']")
	private WebElement search_button;
	
	public void clickOnSearchButton() {
		search_button.click();
	}
	
//	@FindBy(xpath="//a[contains(text(),'Prev')]")
//	private WebElement img_previous_btn;
//
//	public void clickOnImagePreviousBtn() {
//		img_previous_btn.click();
//	}
//	
//	@FindBy(xpath="//a[contains(text(),'Next')]")
//	private WebElement img_nxt_btn;
//	
//	public void clickOnNextBtn() {
//		img_nxt_btn.click();
//	}
//	
//	@FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
//	private WebElement women_menu;
//	
//	public void clickOnWomen() {
//		women_menu.click();
//	}
//	
//	@FindBy(xpath="(//a[@class='sf-with-ul'])[4]")
//	private WebElement tshirts_menu;
//	
//	public void clickOnTShirt() {
//		tshirts_menu.click();
//	}
	
	
	
	
	
	
}
