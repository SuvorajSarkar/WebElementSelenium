package Handle_calender_controls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleClass_3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/");
		// Option-2 with click and get all the dates from the list >Run a loop and select a value from it 
		driver.findElement(By.id("datepicker")).click();
		List<WebElement>allElements=driver.findElements(By.xpath("//table[contains(@class,'calender')]//a"));
		
		for(WebElement ele:allElements) {
			String date=ele.getText();
			System.out.println("Dates are " +date);
			if(date.contains("18")) {
				System.out.println("found");
				ele.click();
				break;
			}
		}
		
		System.out.println(driver.findElement(By.id("datepicker")).getText());
		System.out.println(driver.findElement(By.id("datepicker")).getAttribute("value"));

	}
}
