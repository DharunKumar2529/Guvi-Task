package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class AddCartTest extends ProjectSpecificationMethods{
	
	@BeforeTest
	public void setup() throws Exception {
		readAndWritePropFile();
		sheetname="";
		testName="AddContact Test";
		testDescription="Testing the AddtoCart functionality of the application with valid and invalid details";
		testAuthor="Dharun Kumar";
		testCategory="Smoke Test";
	}
	
	@Test	
	public void AddcartTest() throws Throwable {
	
		new HomePage(driver)
		.clickLoginNav()
		.usernameLogin(prop.getProperty("validUserName"))
		.passwordLogin(prop.getProperty("validPassword"))
		.clickLoginButton()
		.clickOnProduct()
		.clickOnCartButton()
		.clickOnCartNav()
		.validatingProduct();
		//.deleteRowandValidating();
	}

}
