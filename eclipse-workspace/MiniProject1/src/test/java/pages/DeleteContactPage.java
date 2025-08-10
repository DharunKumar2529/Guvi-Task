package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ProjectSpecificationMethod;

public class DeleteContactPage extends ProjectSpecificationMethod{
	
	public DeleteContactPage(WebDriver driver) {

		this.driver=driver;
	}
	
	 @FindBy(xpath = "//button[text()='Delete']") // Adjust locator if different
	    WebElement deleteBtn;

	    public void clickDelete() {
	        deleteBtn.click();
	    }

}
