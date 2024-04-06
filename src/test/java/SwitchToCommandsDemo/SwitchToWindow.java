package SwitchToCommandsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		js.executeAsyncScript("arguments[0].click()", ele);
		String parentHandle=driver.getWindowHandle();
		System.out.println(parentHandle);
		//because set contains only unique element like every window is unique
		Set<String>allHandle=driver.getWindowHandles();
		System.out.println("all handles including parent handles "+allHandle);
		List<String> allHandles1=new ArrayList<String>(allHandle);
		System.out.println("handle 1 "+allHandles1.get(0));
		System.out.println("handle 2 "+allHandles1.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(allHandles1.get(1));
		System.out.println("current tab name "+driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(allHandles1.get(0));
		System.out.println("current tab name "+driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(allHandles1.get(1));
		System.out.println("current tab name "+driver.getTitle());
		
		
	}
}
