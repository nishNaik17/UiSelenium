package main.java.com.browser;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import main.java.com.ExtentReport;

public class Listners extends CallBrowser implements  ITestListener{
	
	ExtentTest test;
	ExtentReports extent = ExtentReport.report();
	
	@Override
	public void onTestStart(ITestResult result) {
		
	    test = extent.createTest(result.getMethod().getMethodName());
	  }
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(test != null) {
	    test.generateLog(Status.PASS, "Test is pass");
		}
		
		 // Close and quit the WebDriver
	    driver.close();
	    driver.quit();
		
	  }
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
		 driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.fail(result.getThrowable());
		String filePath = null;
		try {
			filePath = getScreenShot(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			test.addScreenCaptureFromPath(filePath, getScreenShot(result.getMethod().getMethodName(), driver));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // Close and quit the WebDriver
	    driver.close();
	    driver.quit();
	  }

	
	public void onFinish(ITestContext context) {
	    extent.flush();
	  //  driver.quit();
	  }
}