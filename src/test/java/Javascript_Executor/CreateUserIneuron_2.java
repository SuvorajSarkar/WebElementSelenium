package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
public class CreateUserIneuron_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/signup/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		boolean statusbefore=driver.findElement(By.xpath("//button[contains(@class,'submit-btn')]")).isEnabled();
		System.out.println("status before "+statusbefore);
		driver.findElement(By.name("name")).sendKeys("suvoraj123");
		driver.findElement(By.name("email")).sendKeys("suvoraj123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Suvaraj1@");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('6393ff23ec2ded7360ff7be0')[0].click()");
		js.executeScript("document.getElementsByName('gender')[0].click()");
		new Select(driver.findElement(By.name("state"))).selectByVisibleText("Goa");
		boolean statusAfter=driver.findElement(By.xpath("//button[contains(@class,'submit-btn')]")).isEnabled();
		System.out.println("status before "+statusAfter);
		
		
		try {
		    // Attempt to click the signup button
		    driver.findElement(By.xpath("//button[contains(@class,'submit-btn')]")).click();
		} catch(Exception e) {
		    System.out.println("webelement click failed - retry with js click");
		    WebElement ele=driver.findElement(By.xpath("//button[contains(@class,'submit-btn')]"));
		    js.executeScript("arguments[0].click()",ele);
		    
		    
		}
		Thread.sleep(2000);
		try {
		driver.findElement(By.name("email1")).sendKeys("suvoraj123@gmail.com");
		}catch(Exception e) {
			System.out.println("no such element");
		}
		driver.findElement(By.name("password1")).sendKeys("Suvaraj1@");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
	}
	
}
