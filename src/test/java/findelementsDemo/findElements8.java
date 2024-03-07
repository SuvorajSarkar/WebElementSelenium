package findelementsDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element= driver.findElement(By.id("email"));
		Thread.sleep(2000);
		element.sendKeys("suvoraj");
		driver.navigate().refresh();
		element.sendKeys("suvo");
	}
}
