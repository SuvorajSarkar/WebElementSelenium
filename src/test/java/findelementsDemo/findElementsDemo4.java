package findelementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsDemo4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		List<WebElement> allinputtags = driver.findElements(By.xpath("//input[@type='text']"));
		// this will return number of input tag with type text
		System.out.println(allinputtags.size());

		int totaldd = driver.findElements(By.tagName("select")).size();
		int totalddwithxpath = driver.findElements(By.xpath("//select")).size();
		int totalcheckbox = driver.findElements(By.xpath("//input[@type='ratio']")).size();
		int totalpasswordfield = driver.findElements(By.xpath("//input[@type='password']")).size();
		int hyperlink=driver.findElements(By.tagName("a")).size();

		System.out.println(totaldd);
		System.out.println(totalddwithxpath);
		System.out.println(totalcheckbox);
		System.out.println(totalpasswordfield);
		System.out.println(hyperlink);
		
		
		for (WebElement ele : allinputtags) {
			// get the all inputtags which contains name
			String name = ele.getAttribute("name");
			System.out.println(name);
		}
		
	}
}
