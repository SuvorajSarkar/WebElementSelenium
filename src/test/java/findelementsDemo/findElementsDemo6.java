package findelementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsDemo6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mukesh otwani");
		Thread.sleep(2000);
		//it will cature all the div which contains role='option'(also  it will capture
		//child nodes also
		List<WebElement>allvalues= driver.findElements(By.xpath("//div[@role='presentation']"));
		System.out.println(allvalues.size());
		for(WebElement ele:allvalues) {
			//System.out.println(ele.getText());
			//System.out.println(ele.getAttribute("outerHTML"));
			//System.out.println(ele.getAttribute("innerHTML"));
			String text=ele.getText();
			if(text.contains("linkedin")) {
				ele.click();
				break;
			}
		}
		driver.quit();
	}
}
