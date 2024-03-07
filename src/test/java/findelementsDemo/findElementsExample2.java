package findelementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class findElementsExample2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']"));
		Thread.sleep(3000);
		Select month = new Select(driver.findElement(By.id("month")));
		List<WebElement> allDDoptions = month.getOptions();
		int totalElements= allDDoptions.size();
		System.out.println("Total elements in drop "+totalElements);
		for(int i=0;i<totalElements;i++) {
			WebElement ele= allDDoptions.get(i);
			String value=ele.getText();
			System.out.println("Value is "+value);
			if(value.contains("April")) {
				System.out.println("validation passed");
				break;
			}
			
		}
		driver.quit();
	}
}
