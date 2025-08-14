package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods{

	@FindBy (xpath ="//div[@class='error-message-container']")
	WebElement errorMessage;
	
	@FindBy (id ="item_4_title_link")
	WebElement itemName;
	
	@FindBy (id="add-to-cart-sauce-labs-backpack")
	WebElement addBagButton;
	
	@FindBy (id="shopping_cart_container")
	WebElement cartIcon;
	
	@FindBy (id="react-burger-menu-btn")
	WebElement burgerIcon;
	
	@FindBy (id="inventory_sidebar_link")
	WebElement allItemNav;
	
	@FindBy (id="about_sidebar_link")
	WebElement aboutNav;
	
	@FindBy (id="logout_sidebar_link")
	WebElement logoutNav;
	
	@FindBy (id="reset_sidebar_link")
	WebElement resetAppNav;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement addBikeLight;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addBackpack;
	
	@FindBy(id = "item_4_title_link")
	WebElement itemclick;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public HomePage validatingLogin(String testType, String expectedresult) {
		
		if(testType.equals("ValidInput")) {
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    		alert.accept();
			
    		String homePageTitle = driver.getTitle();
    		Assert.assertEquals(homePageTitle, expectedresult);
    		System.out.println("Signup Successful with valid data");
    		}
		else if(testType.equals("ExistingMailID")) {
    			Assert.assertEquals(errorMessage, expectedresult);
    			System.out.println("Signup not Successful with Existing mailID");
    		}
		else if(testType.equals("emptyField") ) {
    			Assert.assertEquals(errorMessage, expectedresult);
    			System.out.println("Signup not Successful with Empty Field");	
    		}
		return this;
	}
	
	public ProductPage clickOnItemName() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='item_4_title_link']")))
        .click();
		return new ProductPage(driver);
	}
	
	public HomePage addItemsToCart() {
		addBackpack.click();
	    addBikeLight.click();
	   return this;
	}
	
	public CartPages clickonCartPage() {
		cartIcon.click();
		return new CartPages(driver);
	}
	
	public HomePage clickonBurgerIcon() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    //wait.until(ExpectedConditions.visibilityOf(burgerIcon));
		burgerIcon.click();
		return this;
	}
	
	public LoginPage clickonLogout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOf(logoutNav));
	    logoutNav.click();
		return new LoginPage(driver);
	}
	
	public ProductPage Clickonitem() {
		itemclick.click();
		return new ProductPage(driver);
	}
	
}
