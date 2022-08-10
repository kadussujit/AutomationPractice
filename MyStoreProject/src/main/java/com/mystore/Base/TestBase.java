package com.mystore.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mystore.PageLayer.IndexPage;
import com.mystore.PageLayer.LoginPage;
import com.mystore.PageLayer.OrderConfirmationPage;
import com.mystore.PageLayer.OrderSummary;
import com.mystore.PageLayer.PaymentPage;
import com.mystore.PageLayer.SearchResultPage;
import com.mystore.PageLayer.ShippingPage;
import com.mystore.PageLayer.AccountCreationPage;
import com.mystore.PageLayer.AddToCartPage;
import com.mystore.PageLayer.AddressPage;
import com.mystore.PageLayer.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public IndexPage index;
	public LoginPage login;
	public HomePage homepage;
	public AccountCreationPage acc;
	public SearchResultPage searchResult;
	public AddToCartPage addcart;
	public OrderSummary orderSummary;
	public AddressPage addressPage;
	public ShippingPage shippingPage;
	public PaymentPage paymentPage;
	public OrderConfirmationPage confirmOrder;
	
	@BeforeMethod
	public void setUp() {
		String br = "chrome";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please enter correct browser name.");
		}
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		index = new IndexPage();
		login = new LoginPage();
		homepage = new HomePage();
		acc = new AccountCreationPage();
		searchResult = new SearchResultPage();
		addcart = new AddToCartPage();
		orderSummary = new OrderSummary();
		addressPage = new AddressPage();
		shippingPage = new ShippingPage();
		paymentPage = new PaymentPage();
		confirmOrder = new OrderConfirmationPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
