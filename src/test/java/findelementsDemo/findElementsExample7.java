package findelementsDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class findElementsExample7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
		List<WebElement>allLinks=driver.findElements(By.xpath("//img[@src]"));
		for(WebElement ele:allLinks) {
			//System.out.println("Link text is :"+ele.getText());
			//System.out.println("innerHtml is "+ele.getAttribute("innerHTML"));
			System.out.println("outerHtml is "+ele.getAttribute("outerHTML"));
			//System.out.println("src value is "+ele.getAttribute("src"));
		}
		driver.close();
	}
}
