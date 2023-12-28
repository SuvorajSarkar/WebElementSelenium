package WebDriverCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElementCommands3 {
	/*
	 * webelement- interface --which represent the element on page
	 * 
	 * findElement vs findElements
	 * 
	 * findElement - find element and throws exception when element not found
	 * findElement - find element and return List of webelement when element not found still you will get size 0
	 * */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
		
		//Exception with findElement but no Exception with findelements
		//driver.findElements(By.id("email"));
		driver.findElements(By.id("email")).get(0).sendKeys("suvoraj");
		
		
	}
}
