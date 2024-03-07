package findelementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsExample5 {
	/*
	 * diff b/w innerhtml vs outerhtml Diff b/w findelement vs findelements
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> hyperlink = driver.findElements(By.xpath("//img[@href]"));
		/*
		 * for (WebElement ele : hyperlink) {
		 * 
		 * System.out.println("Link text is " + ele.getText()); }
		 */
		System.out.println("***********");
		for (WebElement ele : hyperlink) {
			// System.out.println("inner HTML " + ele.getAttribute("innerHTML"));
			// System.out.println("outer HTML " + ele.getAttribute("outerHTML"));
			// System.out.println("HREF value is "+ele.getAttribute("href"));
			System.out.println("Src value is " + ele.getAttribute("Src"));
		}
		driver.quit();
		/*
		 * System.out.println("***********"); for (WebElement ele : hyperlink) {
		 * System.out.println("Link text is " + ele.getAttribute("outerHTML")); }
		 */
	}
}
