package Handle_calender_controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automate_RadioButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement maleRadioButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("male")));
		maleRadioButton.click();
		Thread.sleep(1000);
		WebElement javaCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("java")));
		javaCheckBox.click();
		Thread.sleep(1000);
		WebElement codeCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("code")));
		codeCheckBox.click();
		
	}
}
