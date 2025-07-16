package task_11;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		
		driver.switchTo().frame(topframe);
		
		driver.switchTo().frame("frame-left");
		
		String Leftframe = driver.findElement(By.tagName("body")).getText();
		
		System.out.println(Leftframe);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		
		String Middleframe = driver.findElement(By.id("content")).getText();
		
		System.out.println(Middleframe);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		
		String Rightframe = driver.findElement(By.tagName("body")).getText();
		
		System.out.println(Rightframe);
		
		driver.switchTo().defaultContent();
		
		WebElement frameElement = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		
		driver.switchTo().frame(frameElement);
		
		String Bottomframe = driver.findElement(By.tagName("body")).getText();
		
		System.out.println(Bottomframe);
         
	}

}
