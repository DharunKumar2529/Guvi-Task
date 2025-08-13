package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class EditContactPage extends ProjectSpecificationMethod {
	
//	public EditContactPage(WebDriver driver) {
//
//		this.driver=driver;
//	}
	
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
    WebElement saveBtn;

    @FindBy(css = ".error-message")
    WebElement errorMsg;
    
    public EditContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public EditContactPage updateFirstName(String firstName) {
       
        firstNameField.sendKeys(firstName);
        return this;
    }

    public EditContactPage updateLastName(String lastName) {
        
        lastNameField.sendKeys(lastName);
        return this;
    }

    public EditContactPage updateBirthDate(String birthDate) {
        
        birthDateField.sendKeys(birthDate);
        return this;
    }

    public EditContactPage updateEmail(String email) {
        
        emailField.sendKeys(email);
        return this;
    }

    public EditContactPage updatePhone(String phone) {
        
        phoneField.sendKeys(phone);
        return this;
    }

    public EditContactPage updateStreet1(String street1) {
       
        street1Field.sendKeys(street1);
        return this;
    }

    public EditContactPage updateStreet2(String street2) {
        
        street2Field.sendKeys(street2);
        return this;
    }

    public EditContactPage updateCity(String city) {
        
        cityField.sendKeys(city);
        return this;
    }

    public EditContactPage updateState(String state) {
        
        stateField.sendKeys(state);
        return this;
    }

    public EditContactPage updatePostalCode(String postalCode) {
        
        postalCodeField.sendKeys(postalCode);
        return this;
    }

    public EditContactPage updateCountry(String country) {
       
        countryField.sendKeys(country);
        return this;
    }

    public EditContactPage clickSave() {
        saveBtn.click();
        return this;
    }

    public String getErrorMessage() {
        return errorMsg.getText();
    }

}
