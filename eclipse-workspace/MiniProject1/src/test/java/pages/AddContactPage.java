package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ProjectSpecificationMethod;

public class AddContactPage extends ProjectSpecificationMethod {

	public AddContactPage(WebDriver driver) {

		this.driver=driver;
	}

	@FindBy(id = "firstName")
	WebElement firstNameField;

	@FindBy(id = "lastName")
	WebElement lastNameField;

	@FindBy(id = "birthdate")
	WebElement birthDateField;

	@FindBy(id = "email")
	WebElement emailField;

	@FindBy(id = "phone")
	WebElement phoneField;

	@FindBy(id = "street1")
	WebElement street1Field;

	@FindBy(id = "street2")
	WebElement street2Field;

	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "stateProvince")
	WebElement stateField;

	@FindBy(id = "postalCode")
	WebElement postalCodeField;

	@FindBy(id = "country")
	WebElement countryField;

	@FindBy(id = "submit")
	WebElement submitBtn;

	@FindBy(css = ".error-message")
	WebElement errorMsg;

	
	public void enterFirstName(String firstName) {
		
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		
		lastNameField.sendKeys(lastName);
	}

	public void enterBirthDate(String birthDate) {
		
		birthDateField.sendKeys(birthDate);
	}

	public void enterEmail(String email) {
		
		emailField.sendKeys(email);
	}

	public void enterPhone(String phone) {
		
		phoneField.sendKeys(phone);
	}

	public void enterStreet1(String street1) {
		
		street1Field.sendKeys(street1);
	}

	public void enterStreet2(String street2) {
		
		street2Field.sendKeys(street2);
	}

	public void enterCity(String city) {
		
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		
		stateField.sendKeys(state);
	}

	public void enterPostalCode(String postalCode) {
		
		postalCodeField.sendKeys(postalCode);
	}

	public void enterCountry(String country) {
		
		countryField.sendKeys(country);
	}

	public void clickSubmit() {
		submitBtn.click();
	}

	public String getErrorMessage() {
		return errorMsg.getText();
	}

}
