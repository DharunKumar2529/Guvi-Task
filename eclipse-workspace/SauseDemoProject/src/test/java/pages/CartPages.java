package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethods;

public class CartPages extends ProjectSpecificationMethods{
	
	@FindBy (id="continue-shopping")
	WebElement continueShoppingButton;
	
	@FindBy (id="checkout")
	WebElement checkoutButton;
	
	@FindBy (id="remove-sauce-labs-backpack")
	WebElement removeButton;
	
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
	
	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement removeBackpackButton;

	@FindBy(className = "cart_item")
	List<WebElement> cartItems;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public CartPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public CartPages validatingCart() {
		WebElement cartItem = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("inventory_item_name"))
        );
		
		if (cartItem.getText().equals("Sauce Labs Backpack")) {
            System.out.println("Test Passed: Product added to cart.");
        } 
		else {
            System.out.println("Test Failed: Product not found in cart.");
        }
		return this;
	}
	
	public CheckoutPage goToCheckout() {
	    checkoutButton.click();
	    return new CheckoutPage(driver);
	}
	
	public CartPages clickOnRemoveButton() {
		removeButton.click();
		return this;
	}
	
	public void removeBackpackAndValidation() {
	    removeBackpackButton.click();
	    boolean found = false;
	    for (WebElement item : cartItems) {
	        String text = item.getText().toLowerCase();
	        if (text.contains("sauce labs backpack")) {
	            found = true;
	            break;
	        }
	    }

	    if (found) {
	        System.out.println("Backpack is still present in the cart.");
	    } 
	    else {
	        System.out.println("Backpack has been successfully removed from the cart.");
	    }
	}
}
