package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.LoginPage;

public class TC_001_LoginTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void setup() throws Exception {
		readAndWritePropFile();
		sheetname="LoginData";
		testName="Login Test";
		testDescription="Testing the Login functionality of the application with valid and invalid details";
		testAuthor="Dharun Kumar";
		testCategory="Smoke Testing";
	}
	
	@Test(dataProvider = "readData")	
	public void LogInTest(String username, String password, String expectedResult, String testType) throws IOException, Exception {
	
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.validatingLogin(testType, expectedResult);
		
	}
}
