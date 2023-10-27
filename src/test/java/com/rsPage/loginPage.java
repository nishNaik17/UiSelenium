package test.java.com.rsPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import main.java.com.browser.CallBrowser;
import main.java.com.pojo.rsPage.LoginPagePojo;


public class loginPage extends CallBrowser {


	@Test(groups = "sanity")
	public void testLogin() {
		try {
			String loginText;
			driver = browser("https://rahulshettyacademy.com/locatorspractice/");
			Thread.sleep(1000);
			LoginPagePojo locator = new LoginPagePojo(driver);
			locator.getUserName().sendKeys("rahul");
			Thread.sleep(1000);
			locator.getUserPassword().sendKeys("rahulshettyacademy");
			Thread.sleep(1000);
			locator.getTermButton().click();
			Thread.sleep(1000);
			locator.getSingInButton().click();
			Thread.sleep(1000);
			loginText = locator.getLoginText().getText();
			Thread.sleep(1000);
			Assert.assertEquals(loginText, "You are successfully logged in.");
			Thread.sleep(1000);
			locator.getLogoutButton().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void invalidLogin() {

		try {
			String errorMessage;
			driver = browser("https://rahulshettyacademy.com/locatorspractice/");
			Thread.sleep(1000);
			LoginPagePojo locator = new LoginPagePojo(driver);
			locator.getUserName().sendKeys("rahul");
			Thread.sleep(1000);
			locator.getUserPassword().sendKeys("rahulshetty");
			Thread.sleep(1000);
			locator.getTermButton().click();
			Thread.sleep(1000);
			locator.getSingInButton().click();
			Thread.sleep(1000);
			errorMessage = locator.getInvalidUser().getText();
			Thread.sleep(1000);
			Assert.assertEquals(errorMessage, "* Incorrect username or passwor");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Test
	public void testPasswordReset() {
		try {

			String message;
			String password = null;
			String loginText;
			driver = browser("https://rahulshettyacademy.com/locatorspractice/");
			Thread.sleep(3000);
			LoginPagePojo locator = new LoginPagePojo(driver);
			locator.getForgotPassword().click();
			Thread.sleep(3000);
			locator.getResetPassword().click();
			message = locator.getPasswordReset().getText();
			//Thread.sleep(5000);
			String[] text = message.split("'");
			for (int i = 0; i <= text.length; i++) {
				if (i == 1) {
					password = text[i];
				}
			}
			Thread.sleep(5000);
			locator.getToLogin().click();
			Thread.sleep(5000);
			locator.getUserName().sendKeys("rahul");
			Thread.sleep(5000);
			locator.getUserPassword().sendKeys(password);
			Thread.sleep(5000);
			locator.getSingInButton().click();
			Thread.sleep(5000);
			loginText = locator.getLoginText().getText();
			Thread.sleep(5000);
			Assert.assertEquals(loginText, "You are successfully logged in.");
			Thread.sleep(5000);
			locator.getLogoutButton().click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
