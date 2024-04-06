package Handle_calender_controls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_calender4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/");
		driver.findElement(By.id("datepicker")).click();
		String year = driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
		String month = driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
		System.out.println(year);
		System.out.println(month);
		/*
		 * write a logic to select date 28 from Aug 2023
		 */
		List<WebElement>alldate= driver.findElements(By.xpath("//span[text()='prev']"));
		for(WebElement ele:alldate) {
			String date=ele.getText();
			if(date.contains("2023")) {
				System.out.println("found");
				ele.click();
				break;
			}
			
		}
		
	}
}
