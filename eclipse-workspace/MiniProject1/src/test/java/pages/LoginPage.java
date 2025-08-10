package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod {

	public LoginPage(WebDriver driver) {
	
		this.driver=driver;
	}
	
	 	@FindBy(id = "email")
	    WebElement emailField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(id = "submit")
	    WebElement loginBtn;

	    @FindBy(css = ".error-message")
	    WebElement errorMsg;
	    
	   public void enterEmail(String Email) {
		   
		   emailField.sendKeys(Email);;
	    }

	    public void enterPassword(String Password) {
	        
	        passwordField.sendKeys(Password);;
	    }

	    public void clickLogin() {
	        
	    	loginBtn.click();
	    }

		
}
