package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEementCommands4 {

	/*
	 * 
	 * */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		WebElement username = driver.findElement(By.id("email1"));
		System.out.println("Display status :" + username.isDisplayed());
		// this is the checked status inside the box
		System.out.println("enable status :" + username.isEnabled());
		System.out.println("placeholder Values :" + username.getAttribute("placeholder"));
		System.out.println("CSS VALUE: " + username.getCssValue("font-size"));
		username.sendKeys("suvoraj@gmail.com");
		Thread.sleep(3000);
		username.clear();
		System.out.println("Value fetch from username: " + username.getAttribute("value"));
	}
}
