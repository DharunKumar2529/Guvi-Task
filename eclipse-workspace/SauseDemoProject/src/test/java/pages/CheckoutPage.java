package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class CheckoutPage extends ProjectSpecificationMethods{

	@FindBy(id = "first-name")
	WebElement firstName;

	@FindBy(id = "last-name")
	WebElement lastName;

	@FindBy(id = "postal-code")
	WebElement zipCode;

	@FindBy(id = "continue")
	WebElement continueButton;
	
	@FindBy(id = "cancel")
	WebElement cancelButton;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public CheckoutPage fillCheckoutInfo(String fname, String lname, String zipcode) {
	    firstName.sendKeys(fname);
	    lastName.sendKeys(lname);
	    zipCode.sendKeys(zipcode);
	    return this;
	}
	
	public CheckoutOverviewPage clickOnContinueButton() {
		continueButton.click();
		return new CheckoutOverviewPage(driver);
	}
}
