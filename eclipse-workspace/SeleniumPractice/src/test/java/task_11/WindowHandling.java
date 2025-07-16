package task_11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		Set<String> windowHandles  = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		String Title1 = driver.getTitle();
		
		System.out.println(Title1);
		
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		
		String Title2 = driver.getTitle();
		
		System.out.println(Title2);
		
		driver.quit();
	}

}
