package main.java.com.pojo.rsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePojo {
	
	WebDriver driver;
	
	public LoginPagePojo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//UserName
	@FindBy(id="inputUsername")
	WebElement userName;
	
	//UserPassword
	@FindBy(name = "inputPassword")
	WebElement userPassword;

	//termButton
	@FindBy(id="chkboxTwo")
	WebElement termButton;
	
	//singInButton
	@FindBy(css = "button[type = 'submit']")
	WebElement submit;
	
	//logoutButton
	@FindBy(xpath = "//button[contains(text(),'Log Out')]")
	WebElement logoutButton;
	
	//landingPage
	@FindBy(xpath = "//p[contains(text(),'You are successfully logged in.')]")
	WebElement loginText;
	
	//InvalidUser
	@FindBy(xpath = "//p[contains(text(),'Incorrect username or password')]")
	WebElement invalidUser;
	
	//Forgot Password
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotPaswd;
	
	//Reset Password
	@FindBy(xpath = "//button[contains(text(),'Reset Login')]")
	WebElement resetPassword;
	
	//New Password
	@FindBy(css ="p.infoMsg")
	WebElement newPassword;
	
	//Login Button
	@FindBy(css = "button.go-to-login-btn")
	WebElement goToLogin;
	
	public WebElement getToLogin() {
		return goToLogin;
	}
	
	public WebElement getPasswordReset() {
		return newPassword;
	}
	
	public WebElement getResetPassword() {
		return resetPassword;
	}
	
	
	public WebElement getForgotPassword( ) {
		return forgotPaswd;
	}
	
	public WebElement getInvalidUser() {
		return invalidUser;
	}
	
	public WebElement getLoginText() {
		return loginText;
	}
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getUserPassword() {
		return userPassword;
	}
	
	public WebElement getTermButton() {
		return termButton;
	}
	
	public WebElement getSingInButton() {
		return submit;
	}
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	
}
