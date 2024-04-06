package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		try {
			Actions action=new Actions(driver);
			WebElement Drag= driver.findElement(By.id("draggable"));
			WebElement Drop= driver.findElement(By.id("droppable"));
			
			action.dragAndDrop(Drag, Drop).build().perform();
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("Exception occur! Drag n Drop operation can not be performed");
		}
	}
}
