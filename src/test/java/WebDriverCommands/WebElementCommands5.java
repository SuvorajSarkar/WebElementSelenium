package WebDriverCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElementCommands5 {
	
	/*
	 * This program help you to find exception which comes when you deal with disable elements
	 * */
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		WebElement username= driver.findElement(By.id("email1"));
		username.sendKeys("suvoraj@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password1")).sendKeys("suvo");
		Thread.sleep(2000);
		driver.findElement(By.className("submit-btn")).click();
		driver.quit();
	}
}
