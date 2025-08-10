package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ProjectSpecificationMethod;

public class SignUpPage extends ProjectSpecificationMethod {
	
	public SignUpPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	 @FindBy(id = "firstName")
	    WebElement firstNameField;

	    @FindBy(id = "lastName")
	    WebElement lastNameField;

	    @FindBy(id = "email")
	    WebElement emailField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(id = "submit")
	    WebElement signUpBtn;

	    @FindBy(css = ".error-message")
	    WebElement errorMsg;

	    public void enterFirstName(String firstName) {
	        
	        firstNameField.sendKeys(firstName);
	    }

	    public void enterLastName(String lastName) {
	        
	        lastNameField.sendKeys(lastName);
	    }

	    public void enterEmail(String email) {
	        
	        emailField.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        
	        passwordField.sendKeys(password);
	    }


	    public void clickSignUp() {
	        signUpBtn.click();
	    }
	    
	    public String getErrorMessage() {
	        return errorMsg.getText();
	    }

}
