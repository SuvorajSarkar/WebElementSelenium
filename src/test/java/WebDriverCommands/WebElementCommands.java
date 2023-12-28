package WebDriverCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElementCommands {
	
	/*
	 * Selenium has direct locator and indirect locators
	 * 1)Direct
	 *   id
	 *   name
	 *   className
	 *   linkText
	 *   partialLinkText
	 *   tagName
	 *   
	 *   2)indirect
	 *   XPath
	 *   CSSSelectors
	 *   
	 *   Selenium 4 has Relative Locators
	 * */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
		WebElement username= driver.findElement(By.id("email1"));
		username.sendKeys("suvoraj@gmail.com");
		Thread.sleep(2000);
		username.clear();
		
		username.sendKeys("suvo@gmail.com");
		Thread.sleep(2000);
		username.clear();
		
		username.sendKeys("sarkar1@gmail.com");
		Thread.sleep(2000);
		username.clear();
		
		username.sendKeys("bapi@gmail.com");
		Thread.sleep(2000);
		username.clear();
		
		
	}
}
