package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {

	@FindBy (id ="user-name")
	WebElement usernameTextfield;
	
	@FindBy (id ="password")
	WebElement passwordTextfield;
	
	@FindBy (xpath ="//div[@class='error-message-container']")
	WebElement errorMessage;
	
	@FindBy (id="login-button")
	WebElement loginButton;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public LoginPage enterUsername(String username) {
		usernameTextfield.sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		passwordTextfield.sendKeys(password);
		testPasswordFieldIsMasked();
		return this;
	}
	
	public void testPasswordFieldIsMasked() {
        WebElement passwordField = driver.findElement(By.id("password"));
        String fieldType = passwordField.getAttribute("type");
        Assert.assertEquals(fieldType, "password", "Password field is not masked!");
    }
	
	public HomePage clickLoginButton() {
		loginButton.click();
		return new HomePage(driver);
	}
	
	public void validatingLogout() {
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equalsIgnoreCase("https://www.saucedemo.com/")) {
		    System.out.println("Logout worked. Current URL: " + currentUrl);
		} else {
		    System.out.println("Logout might have failed. URL: " + currentUrl);
		}
	}
	
}
