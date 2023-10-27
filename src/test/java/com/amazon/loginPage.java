package test.java.com.amazon;

import java.io.IOException;

import org.testng.annotations.Test;

import main.java.com.browser.CallBrowser;

public class loginPage extends CallBrowser{
	
	
	@Test
	public void login() throws IOException, InterruptedException {
		driver = browser("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}
