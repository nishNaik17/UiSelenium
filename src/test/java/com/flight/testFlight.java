package test.java.com.flight;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import main.java.com.browser.CallBrowser;
import main.java.com.pojo.flight.FlightPojo;

public class testFlight extends CallBrowser{
	
	
	@Test
	public void testFlightStaticDropDown() {
		
		try {
		
		driver = browser("https://rahulshettyacademy.com/dropdownsPractise/");
		FlightPojo locator = new FlightPojo(driver);
		
		Select dropDown = new Select(locator.getCurrencyDropDown());
		
		List<WebElement> list = dropDown.getOptions();
		int count = list.size();
		
		for(int i=0;i<=count-1;i++) {
			dropDown.selectByIndex(i);
			Thread.sleep(3000);
			System.out.println(i +"="+ dropDown.getFirstSelectedOption());
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
}
