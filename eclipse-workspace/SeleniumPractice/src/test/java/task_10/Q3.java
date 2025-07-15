package task_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guvi.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.id("name")).sendKeys("demouser");
		
		driver.findElement(By.id("email")).sendKeys("demouser29@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("demouser29");
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
		
		driver.findElement(By.id("signup-btn")).click();
		
		driver.findElement(By.id("laterBtn")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.id("login-btn")).click();
		
		driver.findElement(By.id("email")).sendKeys("gsdharunkumar@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Achudharun@2529");
		
		Actions actions = new Actions(driver);
		
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.id("mobile-login")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	}

}
