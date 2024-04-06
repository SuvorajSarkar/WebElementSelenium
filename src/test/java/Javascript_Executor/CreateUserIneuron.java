package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserIneuron {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://account.ineuron.ai/signup");
		Thread.sleep(3000);
		boolean statusbefore=driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//button[@type='submit'][normalize-space()='Sign Up']")).isEnabled();
		System.out.println("status before it "+statusbefore);
		driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//input[@placeholder='First Name']")).sendKeys("suvo");
		driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//input[@placeholder='Last Name']")).sendKeys("sarkar");
		driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//input[@placeholder='Email Address']")).sendKeys("suvo@gmail.com");
		driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//input[@placeholder='Enter Mobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//input[@placeholder='Create Password']")).sendKeys("Suvoraj1@");
		
		driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//input[@placeholder='Confirm Password']")).sendKeys("Suvoraj1@");
		boolean statusAfter=driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//input[@id='terms']")).isEnabled();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('tandc')[1].click()");
		System.out.println("status before it "+statusAfter);
		driver.findElement(By.xpath("//div[@class='sign-up-mobile flex']//div//button[@type='submit'][normalize-space()='Sign Up']")).click();
	}
}
