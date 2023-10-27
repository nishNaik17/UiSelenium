package test.java.cucumber;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.java.com.browser.CallBrowser;
import main.java.com.pojo.ekart.EkartPojo;
import main.java.com.pojo.rsPage.LoginPagePojo;

public class StepDefination extends CallBrowser{
	
	public WebDriver driver;
	public LoginPagePojo locator;
	public String loginText;
	public EkartPojo eLocator;
	
	@Given("I land on the Website Page")
	public void login() throws InterruptedException, IOException {
		driver = browser("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(1000);
	}
	
	@Given("^The User enters the username (.+) and password (.+)$")
	public void credential(String username, String password) throws InterruptedException {
		locator = new LoginPagePojo(driver);
		locator.getUserName().sendKeys("rahul");
		Thread.sleep(1000);
		locator.getUserPassword().sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
	}
	
	@When("I click on the submit button")
	public void submit() throws InterruptedException {
		locator.getTermButton().click();
		Thread.sleep(1000);
		locator.getSingInButton().click();
		Thread.sleep(1000);
	}
	
	@Then("^I verify the ErrorMessage (.+) in step$")
	public void validate(String errorMessage) throws InterruptedException {
		loginText = locator.getLoginText().getText();
		Thread.sleep(1000);
		Assert.assertEquals(loginText, errorMessage);
		Thread.sleep(1000);
		
	}
	
	@And("Logout the Website")
	public void logout() throws InterruptedException {
		locator.getLogoutButton().click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
	
	
	@Given("User login to eKart Site")
	public void ekartlogin() throws InterruptedException, IOException {
		driver = browser("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
	}
	
	@Given("The User Access the eKart Website")
	public void user_access() {
		
		//eLocator.getShopButton().click();
	}
	
	@When("I click on the Home button")
	public void home_button() throws InterruptedException {
		eLocator = new EkartPojo(driver);
		Thread.sleep(1000);
		eLocator.getShopButton().click();
		Thread.sleep(1000);
	}
	
	@Then("I verify the HeaderMessage {string}")
	public void HeaderMessage(String errorMessage) throws InterruptedException {
		loginText = eLocator.gethome().getText();
		Thread.sleep(1000);
		Assert.assertEquals(loginText, errorMessage);
		Thread.sleep(1000);
		driver.close();
		driver.quit();
		
	}
	
	
}	
