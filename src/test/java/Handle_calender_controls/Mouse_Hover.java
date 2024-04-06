package Handle_calender_controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement Element= driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		//For mouse hover we have to create an object of actions class
		Actions act=new Actions(driver);
		act.moveToElement(Element).perform();
		driver.findElement(By.xpath("//a[text()='TestNG']")).click();
	}
}
