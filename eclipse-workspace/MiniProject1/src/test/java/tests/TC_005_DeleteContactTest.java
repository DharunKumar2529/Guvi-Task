package tests;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.ContactDetailsPage;
import pages.ContactListPage;
import pages.LoginPage;

public class TC_005_DeleteContactTest extends ProjectSpecificationMethod {

	@BeforeTest
	public void setup() throws IOException {
	readAndwritePropFile();
	testName="Deletecontact Test";
	testDescription="Testing the Deletecontact functionality of the application";
	testAuthor="Dharun Kumar";
	testCategory="Smoke Test";
	
	}
	
    @Test
    public void deleteContactTest() throws InterruptedException {
    	
    	LoginPage login = new LoginPage(driver);
    	
    	login.enterEmail(prop.getProperty("useremail"));
    	login.enterPassword(prop.getProperty("password"));
    	login.clickLogin();
    	
        ContactListPage pickcon = new ContactListPage(driver);
        pickcon.contacttableclick();
        
        ContactDetailsPage details = new ContactDetailsPage(driver);
        details.deletebtn();
        Thread.sleep(5000);
    	Alert alert = driver.switchTo().alert();
        String alerttext = alert.getText();
        Assert.assertTrue(alerttext.contains("Are you sure you want to delete this contact?"));
        
    }
    @Test    
    public void verificationofcontactdelete() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
    	
    	login.enterEmail(prop.getProperty("useremail"));
    	login.enterPassword(prop.getProperty("password"));
    	login.clickLogin();
    	
    	Dimension contacttable = driver.findElement(By.id("myTable")).getSize();
    	
        ContactListPage pickcon = new ContactListPage(driver);
        pickcon.contacttableclick();
    	
        ContactDetailsPage details = new ContactDetailsPage(driver);
        details.deletebtn();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();    	
        
        Dimension table = driver.findElement(By.id("myTable")).getSize();
        Assert.assertNotEquals(contacttable, table);
    }

}
