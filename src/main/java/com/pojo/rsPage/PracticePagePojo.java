package main.java.com.pojo.rsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePagePojo {

	WebDriver driver;
	
	public PracticePagePojo(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[contains(@value,'radio1')]")
	WebElement radio1;
	
	public WebElement getRadioButton1() {
		return radio1;
	}
	
	@FindBy(xpath = "//input[contains(@value,'radio2')]")
	WebElement radio2;
	
	public WebElement getRadioButton2() {
		return radio2;
	}
	
	@FindBy(xpath = "//input[contains(@value,'radio3')]")
	WebElement radio3;
	
	public WebElement getRadioButton3() {
		return radio3;
	}
	
	@FindBy(css = "select#dropdown-class-example") //css with ID
	WebElement dropDown;
	
	public WebElement getDropDown() {
		return dropDown;
	}
	
	@FindBy(xpath = "//option[contains(text(),'Option1')]")
	WebElement option1;
	
	public WebElement getOption1() {
		return option1;
	}
	
	@FindBy(xpath = "//option[contains(text(),'Option2')]")
	WebElement option2;
	
	public WebElement getOption2() {
		return option2;
	}
	
	@FindBy(xpath = "//option[contains(text(),'Option3')]")
	WebElement option3;
	
	public WebElement getOption3() {
		return option3;
	}
	
}
