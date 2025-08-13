package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class SignUpPage extends ProjectSpecificationMethod {
	
//	public SignUpPage(WebDriver driver) {
//		
//		this.driver=driver;
//	}
//	
		@FindBy(id = "signup")
		WebElement signupbtn;
		
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

	    public SignUpPage(WebDriver driver) {
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
			
		}
	    
	    public SignUpPage signupbtn() {
	        
	    	signupbtn.click();
	        return this;
	    }
	    
	    
	    public SignUpPage enterFirstName(String firstName) {
	        
	        firstNameField.sendKeys(firstName);
	        return this;
	    }

	    public SignUpPage enterLastName(String lastName) {
	        
	        lastNameField.sendKeys(lastName);
	        return this;
	    }

	    public SignUpPage enterEmail(String email) {
	        
	        emailField.sendKeys(email);
	        return this;
	    }

	    public void enterPassword(String password) {
	        
	        passwordField.sendKeys(password);
	    }


	    public AddContactPage clickSignUp() {
	        signUpBtn.click();
	        return new AddContactPage(driver);
	    }
	    
	    public String getErrorMessage() {
	        return errorMsg.getText();
	    }

}
