package main.java.com.browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CallBrowser {

	public WebDriver driver;
	public String brw;

	@SuppressWarnings("deprecation")
	public WebDriver browser(String url) throws IOException {

		Properties prod = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\resources\\data.properties");
		prod.load(file);

		String browser = System.getProperty("browser") != null ? System.getProperty("browser")
				: prod.getProperty("browser");

		try {
			switch (browser) {
			case "chrome":
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(url);
				break;

			case "chromeheadless":

				ChromeOptions coption = new ChromeOptions();
				coption.addArguments("headless");

				driver = new ChromeDriver(coption);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(url);
				break;

			case "firefox":
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get(url);
				break;
			case "safari":
				driver = new SafariDriver();
				driver.manage().window().maximize();
				driver.get(url);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "report" + testCaseName + ".png";
	}

}
