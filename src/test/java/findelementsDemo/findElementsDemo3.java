package findelementsDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class findElementsDemo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']"));
		Thread.sleep(3000);
		Select month = new Select(driver.findElement(By.id("month")));
		List<WebElement> allDDaoptions = month.getOptions();
		List<String> ddvalues=new ArrayList<String>();
		for(WebElement ele:allDDaoptions) {
			String text=ele.getText();
			ddvalues.add(text);
		}
		System.out.println(ddvalues);
		driver.quit();
	}
}
