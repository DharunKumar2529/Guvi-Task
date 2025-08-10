package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;
import utils.Utility;

public class TC_001_LoginTest extends ProjectSpecificationMethod{

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

		if (Type.equalsIgnoreCase("Valid")) {
			
			Assert.assertTrue(driver.getCurrentUrl().contains("/contactList"), "Login failed for valid credentials");
		}
	}
}
