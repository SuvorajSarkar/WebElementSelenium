package elementsInteractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Usercreations {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // 111
		/*
		 * driver=new ChromeDriver(); //121 driver=new ChromeDriver();//131 driver=new
		 * ChromeDriver();//141 driver.get("https://www.google.com");
		 * driver.findElement(By.name("q")).sendKeys("suvoraj");
		 */
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("suvo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("sarkar");
		Thread.sleep(2000);
		
		
		// WebElement monthDropdown =
		// driver.findElement(By.cssSelector("select[title='Month']"));

		Select month = new Select(driver.findElement(By.cssSelector("select[title='Month']")));
		// select 4th value
		month.selectByIndex(3);
		System.out.println(month.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		// select oct
		month.selectByValue("10");
		System.out.println(month.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		// select Aug
		month.selectByVisibleText("Aug");

		System.out.println(month.getFirstSelectedOption().getText());
	}
}
