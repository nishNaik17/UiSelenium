package test.java.com.rsPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import main.java.com.browser.CallBrowser;
import main.java.com.pojo.rsPage.PracticePagePojo;

public class testRsPracticePage extends CallBrowser {
	
	
	@Test(groups = "sanity")
	public void testParacticeRadioButton() {
		
		try {
		driver = browser("https://rahulshettyacademy.com/AutomationPractice/");
		PracticePagePojo locator = new PracticePagePojo(driver);
		locator.getRadioButton1().click();
		Thread.sleep(3000);
		locator.getRadioButton2().click();
		Thread.sleep(3000);
		locator.getRadioButton3().click();
		Thread.sleep(3000);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPracticeDropDown() {
		
		try {
		driver = browser("https://rahulshettyacademy.com/AutomationPractice/");
		PracticePagePojo locator = new PracticePagePojo(driver);
		locator.getDropDown().click();
		Thread.sleep(3000);
		locator.getOption1().click();
		Thread.sleep(3000);
		locator.getOption2().click();
		Thread.sleep(3000);
		locator.getOption3().click();
		Thread.sleep(3000);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
