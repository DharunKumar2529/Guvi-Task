package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;
import utils.Utility;

public class TC_001_LoginTest extends ProjectSpecificationMethod{
	
	@BeforeTest
	public void setup() throws Exception {
		testName="Login Test";
		testDescription="Testing the Login functionality of the application with valid and invalid details";
		testAuthor="Dharun Kumar";
		testCategory="Smoke Test";
	}
	
	public void testdetails() {
		
		test = extent.createTest(testName, testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}

	@DataProvider(name = "LoginData")
	public Object[][] getLoginData() throws IOException {
		
		String filePath = System.getProperty("user.dir") +"/src/test/resources/LoginData.xlsx";
		
		return Utility.readExcelData(filePath, "Logindata");
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String Email, String Password, String Type, String ExpectedMessage) {
		
		LoginPage login = new LoginPage(driver);
		login.enterEmail(Email);
		login.enterPassword(Password);
		login.clickLogin();
	}
}
