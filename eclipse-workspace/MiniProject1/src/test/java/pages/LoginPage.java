package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod {

	 	@FindBy(id = "email")
	    WebElement emailField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(id = "submit")
	    WebElement loginBtn;

	    @FindBy(css = ".error-message")
	    WebElement errorMsg;
	    
	    public LoginPage(WebDriver driver) {
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
			
		}
	    
	   public LoginPage enterEmail(String Email) {
		   
		   emailField.sendKeys(Email);
		   return this;
		   
	    }

	    public LoginPage enterPassword(String Password) {
	        
	        passwordField.sendKeys(Password);
	        return this;
	    }

	    public AddContactPage clickLogin() {
	        
	    	loginBtn.click();
	    	return new AddContactPage(driver);
	    }

		
}
