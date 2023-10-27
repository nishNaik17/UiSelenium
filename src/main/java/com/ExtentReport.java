package main.java.com;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	
	public static ExtentReports report() {
		
		String path = System.getProperty("usr.dir")+"report\\testRepot.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("MyTestReport");
		report.config().setDocumentTitle("Sample Test");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Nishanth");
		return extent;
	}


}
