package findelementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 1- whenever you need to deal with > 1
 * 		Autosuggestion
 * 		Dropdown without Select 
 * 		Calender
 * 2- Optional check
 * 
 * 3-with tagName
 * 
 * 
 * */

public class findelementsExample1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']"));
		Thread.sleep(3000);
		Select month = new Select(driver.findElement(By.id("month")));
		List<WebElement> allDDoptions = month.getOptions();
		for (WebElement ele : allDDoptions) {
			String values = ele.getText();
			System.out.println("values are " + values);
			if(values.contains("Aug")) {
				System.out.println("found");
				break;
			}
		}
		driver.quit();
	}
}
