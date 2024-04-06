package SwitchToCommandsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithToDemo2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		String Parent_Handle = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Set<String> allWindowHandle = driver.getWindowHandles();
		Iterator<String> Itr = allWindowHandle.iterator();
		while (Itr.hasNext()) {
			String child = Itr.next();
			if (!Parent_Handle.equals(child)) {
				driver.switchTo().window(child);
				String title = driver.getTitle();
				System.out.println("Title of application is " + title);
				//very important
				driver.close();
			}
		}
		driver.switchTo().window(Parent_Handle);
		String title=driver.getTitle();
		System.out.println("title of the aplication is - "+title);
		driver.quit();
	}
}
