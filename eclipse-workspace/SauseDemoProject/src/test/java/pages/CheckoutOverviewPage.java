package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class CheckoutOverviewPage extends ProjectSpecificationMethods{

	@FindBy(className = "inventory_item_price")
	static
	List<WebElement> itemPrices;

	@FindBy(className = "summary_subtotal_label")
	static
	WebElement itemTotal;

	@FindBy(className = "summary_tax_label")
	static
	WebElement taxAmount;

	@FindBy(className = "summary_total_label")
	static
	WebElement totalAmount;
	
	@FindBy(id = "cancel")
	WebElement cancelButton;
	
	@FindBy(id = "finish")
	WebElement finishButton;
	
	public CheckoutOverviewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public static double getTotalFromItems() {
	    double sum = 0.0;
	    for (WebElement price : itemPrices) {
	        sum += Double.parseDouble(price.getText().replace("$", ""));
	    }
	    return sum;
	}

	public static double getDisplayedItemTotal() {
	    return Double.parseDouble(itemTotal.getText().replace("Item total: $", ""));
	}

	public static double getTax() {
	    return Double.parseDouble(taxAmount.getText().replace("Tax: $", ""));
	}

	public static double getTotalWithTax() {
	    return Double.parseDouble(totalAmount.getText().replace("Total: $", ""));
	}
	
	public CheckoutCompletePage clickonFinishButton() {
		finishButton.click();
		return new CheckoutCompletePage(driver);
	}
}
