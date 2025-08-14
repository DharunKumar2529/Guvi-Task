package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class CheckoutCompletePage extends ProjectSpecificationMethods{

	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	WebElement confirmationMessage;
	
	@FindBy(id ="back-to-products")
	WebElement backButton;
	
	
	public CheckoutCompletePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public HomePage clickonBackButton() {
		backButton.click();
		return new HomePage(driver);
	}
	
	public CheckoutCompletePage validatingConfirmation(String expectedMessage) {
		if((confirmationMessage.getText()).equals(expectedMessage)) {
			System.out.println("Order Placed Successfully");
		}else {
			System.out.println("Order not Placed Successful");
		}
		return this;
	}
	
}
