package task_9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
