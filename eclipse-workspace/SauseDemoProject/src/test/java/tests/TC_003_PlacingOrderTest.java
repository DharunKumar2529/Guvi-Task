package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.LoginPage;

public class TC_003_PlacingOrderTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() throws Exception {
		readAndWritePropFile();
		sheetname="";
		testName="PlacingOrder Test";
		testDescription="Testing the PlacingOrder functionality of the application with valid and invalid details";
		testAuthor="Dharun Kumar";
		testCategory="Smoke Testing";
	}
	
	@Test	
	public void CartfunctionTesting() throws IOException, Exception {
	
		new LoginPage(driver)
		.enterUsername(prop.getProperty("validUserName"))
		.enterPassword(prop.getProperty("validPassword"))
		.clickLoginButton()
		.addItemsToCart()
		.clickonCartPage()
		.goToCheckout()
		.fillCheckoutInfo("Gopal", "Krish", "635110")
		.clickOnContinueButton()
		.clickonFinishButton()
		.validatingConfirmation(prop.getProperty("expectedMessage"));
		
	}
}
