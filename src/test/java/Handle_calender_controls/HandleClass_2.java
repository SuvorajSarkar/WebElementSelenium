package Handle_calender_controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleClass_2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/");
		//Option-2 with click and click
		driver.findElement(By.id("datepicker")).click();
		//click on next month
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//pick the date
		driver.findElement(By.xpath("//a[text()='11']")).click();
		
	}
}
