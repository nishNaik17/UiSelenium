package main.java.com.pojo.flight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPojo {
	
	WebDriver driver;
	
	public FlightPojo(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ctl00_mainContent_DropDownListCurrency")
	WebElement currencyDrpDwn;
	
	public WebElement getCurrencyDropDown() {
		return currencyDrpDwn;
	}
	

}
