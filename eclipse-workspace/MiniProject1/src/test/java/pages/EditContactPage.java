package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ProjectSpecificationMethod;

public class EditContactPage extends ProjectSpecificationMethod {
	
	public EditContactPage(WebDriver driver) {

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
    WebElement saveBtn;

    @FindBy(css = ".error-message")
    WebElement errorMsg;

    
    public void updateFirstName(String firstName) {
       
        firstNameField.sendKeys(firstName);
    }

    public void updateLastName(String lastName) {
        
        lastNameField.sendKeys(lastName);
    }

    public void updateBirthDate(String birthDate) {
        
        birthDateField.sendKeys(birthDate);
    }

    public void updateEmail(String email) {
        
        emailField.sendKeys(email);
    }

    public void updatePhone(String phone) {
        
        phoneField.sendKeys(phone);
    }

    public void updateStreet1(String street1) {
       
        street1Field.sendKeys(street1);
    }

    public void updateStreet2(String street2) {
        
        street2Field.sendKeys(street2);
    }

    public void updateCity(String city) {
        
        cityField.sendKeys(city);
    }

    public void updateState(String state) {
        
        stateField.sendKeys(state);
    }

    public void updatePostalCode(String postalCode) {
        
        postalCodeField.sendKeys(postalCode);
    }

    public void updateCountry(String country) {
       
        countryField.sendKeys(country);
    }

    public void clickSave() {
        saveBtn.click();
    }

    public String getErrorMessage() {
        return errorMsg.getText();
    }

}
