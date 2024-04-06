package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ClickByJavascript {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mukesh otwani");
		Thread.sleep(2000);
		// driver.findElement(By.name("btnK")).click();
		/*
		 * document.getElemenetsByName("btnI")[1].click()
		 */
		
		/*
		 * click can work with disable,hidden,covered elements
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('btnK')[1].click()");
	}
}
