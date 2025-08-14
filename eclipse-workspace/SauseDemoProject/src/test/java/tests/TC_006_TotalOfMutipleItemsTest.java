package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.CheckoutOverviewPage;
import pages.LoginPage;

public class TC_006_TotalOfMutipleItemsTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() throws Exception {
		readAndWritePropFile();
		sheetname="";
		testName="MutipleCartToatl Test";
		testDescription="Testing the MutipleCartToatl functionality of the application with valid and invalid details";
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
		.fillCheckoutInfo("Dharun", "Kumar", "638052")
		.clickOnContinueButton();
		
		
		double expectedItemTotal = CheckoutOverviewPage.getTotalFromItems();
	    double displayedItemTotal = CheckoutOverviewPage.getDisplayedItemTotal();
	    double tax = CheckoutOverviewPage.getTax();
	    double total = CheckoutOverviewPage.getTotalWithTax();

	    Assert.assertEquals(displayedItemTotal, expectedItemTotal, "Item total mismatch!");
	    Assert.assertEquals(total, displayedItemTotal + tax, "Total price with tax mismatch!");
		
	}
}
