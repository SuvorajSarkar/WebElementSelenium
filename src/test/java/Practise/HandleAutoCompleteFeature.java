package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAutoCompleteFeature {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
		WebElement Textfield = driver.findElement(By.id("tags"));
		Textfield.sendKeys("java");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		WebElement suggetion = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='suggestionList']//div[contains(text(),'javaScript')]")));
		suggetion.click();

	}
}
