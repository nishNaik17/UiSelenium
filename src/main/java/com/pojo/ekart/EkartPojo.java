package main.java.com.pojo.ekart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EkartPojo {

	WebDriver driver;

	public EkartPojo(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Shop")
	WebElement shopLink;

	public WebElement getShopButton() {
		return shopLink;
	}

	@FindBy(xpath = "//app-card-list/app-card[1]/div[1]/div[2]/button")
	WebElement button1;

	public WebElement getIphoneX() {
		return button1;
	}

	@FindBy(css = "nav.navbar.navbar-expand-lg.navbar-dark.bg-dark.navbar-fixed-top div.container div.collapse.navbar-collapse ul.navbar-nav.ml-auto li.nav-item.active > a.nav-link.btn.btn-primary")
	WebElement checkoutButton;

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	@FindBy(xpath = "//a[contains(text(),'ProtoCommerce Home')]")
	WebElement home;
	
	public WebElement gethome() {
		return home;
	}
}
