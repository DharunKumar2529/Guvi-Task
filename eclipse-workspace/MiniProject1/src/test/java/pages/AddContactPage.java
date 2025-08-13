package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class AddContactPage extends ProjectSpecificationMethod {

	@FindBy(id = "add-contact")
	WebElement addcontactbtn;
	
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
	
	 public AddContactPage(WebDriver driver) {
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
			
		}
	 
	 public AddContactPage addcontactbtn() {
		 addcontactbtn.click();
		 return this;
	 }

	
	public AddContactPage enterFirstName(String firstName) {
		
		firstNameField.sendKeys(firstName);
		return this;
	}

	public AddContactPage enterLastName(String lastName) {
		
		lastNameField.sendKeys(lastName);
		return this;
	}

	public AddContactPage enterBirthDate(String birthDate) {
		
		birthDateField.sendKeys(birthDate);
		return this;
	}

	public AddContactPage enterEmail(String email) {
		
		emailField.sendKeys(email);
		return this;
	}

	public AddContactPage enterPhone(String phone) {
		
		phoneField.sendKeys(phone);
		return this;
	}

	public AddContactPage enterStreet1(String street1) {
		
		street1Field.sendKeys(street1);
		return this;
	}

	public AddContactPage enterStreet2(String street2) {
		
		street2Field.sendKeys(street2);
		return this;
	}

	public AddContactPage enterCity(String city) {
		
		cityField.sendKeys(city);
		return this;
	}

	public AddContactPage enterState(String state) {
		
		stateField.sendKeys(state);
		return this;
	}

	public AddContactPage enterPostalCode(String postalCode) {
		
		postalCodeField.sendKeys(postalCode);
		return this;
	}

	public AddContactPage enterCountry(String country) {
		
		countryField.sendKeys(country);
		return this;
	}

	public AddContactPage clickSubmit() {
		submitBtn.click();
		return this;
	}

	public String getErrorMessage() {
		return errorMsg.getText();
	}

}
