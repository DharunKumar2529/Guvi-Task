package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.LoginPage;

public class TC_005_RemoveItemTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() throws Exception {
		readAndWritePropFile();
		sheetname="";
		testName="RemoveCartItem Test";
		testDescription="Testing the RemoveCartItem functionality of the application with valid and invalid details";
		testAuthor="Dharun Kumar";
		testCategory="Smoke Testing";
	}
	
	@Test	
	public void CartfunctionTesting() throws IOException, Exception {
	
		new LoginPage(driver)
		.enterUsername(prop.getProperty("validUserName"))
		.enterPassword(prop.getProperty("validPassword"))
		.clickLoginButton()
		.clickOnItemName()
		.clickonAddcartButton()
		.clickonCartIcon()
		.removeBackpackAndValidation();
	}
}
