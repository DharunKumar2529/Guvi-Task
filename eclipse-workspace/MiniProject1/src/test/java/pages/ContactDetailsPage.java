package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class ContactDetailsPage extends ProjectSpecificationMethod {

	@FindBy(id = "edit-contact")
	WebElement editcontactbtn;
	
	@FindBy(id = "delete")
	WebElement deletebtn;
	
	@FindBy(id = "return")
	WebElement returnbtn;
	
	public ContactDetailsPage (WebDriver driver) {
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
		
	}
    
   public EditContactPage editbtn() {
	   editcontactbtn.click();
	   return new EditContactPage(driver);   
	
    }
   
   public ContactListPage deletebtn() {
	   deletebtn.click();
	   return new ContactListPage(driver);   
    }
   
   public ContactListPage returnbtn() {
	  returnbtn.click();
	   return new ContactListPage(driver);   
	
    }
   
}
