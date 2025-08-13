package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class ContactListPage extends ProjectSpecificationMethod {
	
	@FindBy(id = "add-contact")
	WebElement addcontactbtn;
	
	@FindBy(id = "logout")
	WebElement logoutbtn;
	
	@FindBy(xpath = "//tr[@class='contactTableBodyRow']")
	WebElement ClickContactTable;
	
	 public ContactListPage(WebDriver driver) {
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
			
		}
	    
	   public AddContactPage addcoontbtn(String Email) {
		   addcontactbtn.click();
		   return new AddContactPage(driver);
		
	    }
	   public LoginPage logoutbtn(String Email) {
		   logoutbtn.click();
		   return new LoginPage(driver);
	   }
	   
	   public ContactListPage contacttableclick() {
		   ClickContactTable.click();
		   return new ContactListPage(driver);
	   }
	   

}
