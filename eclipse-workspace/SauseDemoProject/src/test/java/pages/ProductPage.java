package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethods;

public class ProductPage extends ProjectSpecificationMethods{

	@FindBy (id="add-to-cart")
	WebElement addcartButton;
	
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
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addBackpack;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public ProductPage clickonAddcartButton() {
		wait.until(ExpectedConditions.visibilityOf(addBackpack));
		addBackpack.click();
		return this;
	}
	
	public CartPages clickonCartIcon() {
		cartIcon.click();
		return new CartPages(driver);
	}
	
}
