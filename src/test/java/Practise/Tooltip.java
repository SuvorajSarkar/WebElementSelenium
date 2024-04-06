package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-tooltip-in-selenium.html");
		driver.manage().window().maximize();
		WebElement TooltipText= driver.findElement(By.xpath("//div[contains(@class,'tooltip')]"));
		String TooltipTitle= TooltipText.getText();
		System.out.println("The TooltipTitle is "+TooltipTitle);

	}
}
