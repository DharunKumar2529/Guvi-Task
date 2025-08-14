package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.LoginPage;

public class TC_002_CartFunctionTesting extends ProjectSpecificationMethods{
	
	@BeforeTest
	public void setup() throws Exception {
		readAndWritePropFile();
		sheetname="";
		testName="Cart Test";
		testDescription="Testing the Cart functionality of the application with valid and invalid details";
		testAuthor="Dharun Kumar";
		testCategory="Smoke Testing";
	}
	
	@Test	
	public void CartfunctionTesting() throws IOException, Exception {
	
		new LoginPage(driver)
		.enterUsername(prop.getProperty("validUserName"))
		.enterPassword(prop.getProperty("validPassword"))
		.clickLoginButton()
		.Clickonitem()
		.clickonAddcartButton()
		.clickonCartIcon()
		.validatingCart();
		
	}
	
}
