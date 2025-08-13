package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.ContactDetailsPage;
import pages.ContactListPage;
import pages.LoginPage;


	public class TC_004_EditContactTest extends ProjectSpecificationMethod {

		@BeforeTest
		public void setup() throws IOException {
		readAndwritePropFile();
		testName="Editcontact Test";
		testDescription="Testing the Login functionality of the application with valid and invalid details";
		testAuthor="Dharun Kumar";
		testCategory="Smoke Test";
		
		
		}
		
    @Test(priority = 1)
    public void editlastname() throws InterruptedException {

       
    	LoginPage login = new LoginPage(driver);
    	
    	login.enterEmail(prop.getProperty("useremail"));
    	login.enterPassword(prop.getProperty("password"));
    	login.clickLogin();
    	
    	ContactListPage list = new ContactListPage(driver);
    			list.contacttableclick();
    	
    	ContactDetailsPage details = new ContactDetailsPage(driver);
    			details.editbtn();
    			
        WebElement lastname = driver.findElement(By.id("lastName"));
        Thread.sleep(5000);
        lastname.click();
        lastname.clear();
        
        WebElement save = driver.findElement(By.id("submit"));
        save.click();
    }
        
        @Test(priority = 2)
        public void editContactTest() throws InterruptedException {

            
        	LoginPage login = new LoginPage(driver);
        	
        	login.enterEmail(prop.getProperty("useremail"));
        	login.enterPassword(prop.getProperty("password"));
        	login.clickLogin();
        	
        	ContactListPage list = new ContactListPage(driver);
        			list.contacttableclick();
        	
        	ContactDetailsPage details = new ContactDetailsPage(driver);
        			details.editbtn();
        			
            WebElement email = driver.findElement(By.id("email"));
            Thread.sleep(5000);
            email.click();
            email.clear();
            email.sendKeys("nithulan1@gmail.com");
            
            WebElement phone = driver.findElement(By.id("phone"));
            Thread.sleep(5000);
            phone.click();
            phone.clear();
            phone.sendKeys("1234567890");
            
            WebElement save = driver.findElement(By.id("submit"));
            save.click();
        }
        
        @Test(priority = 3)
        public void editcancel() throws InterruptedException {

            
        	LoginPage login = new LoginPage(driver);
        	
        	login.enterEmail(prop.getProperty("useremail"));
        	login.enterPassword(prop.getProperty("password"));
        	login.clickLogin();
        	
        	ContactListPage list = new ContactListPage(driver);
        			list.contacttableclick();
        	
        	ContactDetailsPage details = new ContactDetailsPage(driver);
        			details.editbtn();
        			
            WebElement cancel = driver.findElement(By.id("cancel"));
            Thread.sleep(5000);
            cancel.click();
}
}