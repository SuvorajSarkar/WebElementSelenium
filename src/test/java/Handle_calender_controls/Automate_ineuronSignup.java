package Handle_calender_controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_ineuronSignup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://account.ineuron.ai/signup");
		driver.manage().window().maximize();	
		driver.findElement(By.name("firstName")).sendKeys("suvo");
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("sarkar");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'input form-control')]")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("Suvdfjsd1@");
		driver.findElement(By.name("confirmPassword")).sendKeys("Suvdfjsd1@");
		driver.findElement(By.name("tandc")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
}
