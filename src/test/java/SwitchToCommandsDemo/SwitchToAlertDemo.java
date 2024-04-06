package SwitchToCommandsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class SwitchToAlertDemo {
	/*
	 * ->alert alert("I am learning js now") ->confirm -accept(true) and
	 * dismiss(false) confirm("Do you want to leave?") ->prompt
	 * prompt("enter a number")
	 * 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		try {
		driver.findElement(By.xpath("//button[text()='Click to show']")).click();
		}catch(Exception e) {
			System.out.println("retry! please try js click");
			WebElement ele=driver.findElement(By.xpath("//button[text()='Click to show']"));
			js.executeAsyncScript("arguments[0].click()", ele);
		}
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();
		alt.accept();

	}
}
