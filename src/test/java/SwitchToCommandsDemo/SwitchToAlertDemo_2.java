package SwitchToCommandsDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;

public class SwitchToAlertDemo_2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//button[text()='Click to see after 5s']"));
		js.executeAsyncScript("arguments[0].click()", ele);
		/*
		 * write a logic to wait until alert present max time 10 second, if alert is
		 * present in 5 second then break the loop SwitchToAlert >capture text >print
		 * >Accept
		 * 
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			Alert alt = wait.withTimeout(Duration.ofSeconds(5)).ignoring(NoAlertPresentException.class)
					.until(ExpectedConditions.alertIsPresent());
			String text = alt.getText();
			System.out.println(text);
			// accept the alert
			alt.accept();
			// dismiss the alert
			// alt.dismiss();
			// To enter text in alert
			// alt.sendKeys("");
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is present within 10 sec");
		}
	}
}
