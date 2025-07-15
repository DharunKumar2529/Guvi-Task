package task_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		
		driver.findElement(By.xpath("//a[text()='22']")).click();
		
		String date = driver.findElement(By.id("datepicker")).getCssValue("value");
		
		System.out.println(date);
	}

}
