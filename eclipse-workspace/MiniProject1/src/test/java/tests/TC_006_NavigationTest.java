package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.ContactListPage;
import pages.LoginPage;

public class TC_006_NavigationTest extends ProjectSpecificationMethod{
	
	@BeforeTest
	public void setup() throws IOException {
	readAndwritePropFile();
	testName="Navigation Test";
	testDescription="Testing the Navigation functionality of the application";
	testAuthor="Dharun Kumar";
	testCategory="Smoke Test";
	}
	@Test(priority = 1)
	public void NavigationTest() throws InterruptedException {
 
		LoginPage login = new LoginPage(driver);
		login.enterEmail(prop.getProperty("useremail"))
		.enterPassword(prop.getProperty("password"))
		.clickLogin();
 
 
		Thread.sleep(2500);	
		Assert.assertTrue(driver.getTitle().contains("My Contacts"));
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='add-contact']")).isDisplayed());
 
	}
 
	@Test(priority = 2)
	public void ActionButtonsVisibility() {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='submit']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='signup']")).isDisplayed());
	}
 
	@Test(priority = 3)
	public void AddContactNavTest() throws InterruptedException {
 
		LoginPage login = new LoginPage(driver);
		login.enterEmail(prop.getProperty("useremail"))
		.enterPassword(prop.getProperty("password"))
		.clickLogin();
 
 
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@id='add-contact']")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.id("logout")).isDisplayed());
		Assert.assertTrue(driver.getPageSource().contains("Add Contact"));
 
 
	}
	
	@Test(priority = 4)
	public void EditContactNavTest() throws InterruptedException {
 
		LoginPage login = new LoginPage(driver);
		login.enterEmail(prop.getProperty("useremail"))
		.enterPassword(prop.getProperty("password"))
		.clickLogin();		
 
		ContactListPage viewcontact = new ContactListPage(driver);
		viewcontact.contacttableclick();
		
		Assert.assertTrue(driver.findElement(By.id("edit-contact")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("delete")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("return")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("logout")).isDisplayed());
		Assert.assertTrue(driver.getPageSource().contains("Contact Details"));
 
	}
	
	@Test(priority = 4)
	public void Logotest() throws InterruptedException {
 
		LoginPage login = new LoginPage(driver);
		login.enterEmail(prop.getProperty("useremail"))
		.enterPassword(prop.getProperty("password"))
		.clickLogin();
		
		WebElement logo = driver.findElement(By.xpath("//img[@src='/img/thinkingTesterLogo.png']"));
		logo.click();
}
}
