package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import utils.Utility;

public class ProjectSpecificationMethod extends Utility{
	
	@BeforeSuite
	public void createReport() {
		
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\Faster\\eclipse-workspace\\MiniProject1\\src\\test\\resources\\TestOutput\\ContactlistappReport.html");
		reporter.config().setReportName("Contact List Test report");
		
		 
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
	}
	
	@BeforeClass
	public void testDeatils() {
	
		test = extent.createTest(testName, testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void browserLaunchAndUrlLoad(String browser, String url) throws InterruptedException {
		
		launchBrowserAndloadUrl(browser,url);
	}
	
	@AfterClass
    public void teardown() {
        if (driver != null) {
           driver.quit();
        }
    }
	
//	@AfterMethod
	public void closeBrowser() {
		browserClose();
	}
	
	
	@AfterSuite
	public void closeReport() {
		
		extent.flush();
	
	}
}
