package test.java.com.ekart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import main.java.com.browser.CallBrowser;
import main.java.com.pojo.ekart.EkartPojo;


public class EkartWebsite extends CallBrowser{
	
	@Test
	public void testekartWithOneItem() {
		
		try {
		driver = browser("https://rahulshettyacademy.com/angularpractice/");
		EkartPojo locator = new EkartPojo(driver);
		locator.getShopButton().click();
		locator.getIphoneX().click();
		System.out.println(locator.getCheckoutButton().getText());
		String text = locator.gethome().getText();
		Assert.assertEquals(text, "ProtoCommerce Home");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

