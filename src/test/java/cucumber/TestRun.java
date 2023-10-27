package test.java.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/cucumber",glue = "test.java.cucumber", monochrome = true, plugin = {"html:target/report.html"})
public class TestRun extends AbstractTestNGCucumberTests{

}



/*
 * // with tags
 * 
 * @CucumberOptions(features = "src/test/java/cucumber",glue =
 * "test.java.cucumber", monochrome = true, tags = "@Regression", plugin =
 * {"html:target/report.html"}) public class TestRuns extends
 * AbstractTestNGCucumberTests{
 * 
 * }
 */