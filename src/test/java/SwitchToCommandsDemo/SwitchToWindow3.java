package SwitchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow3 {
	
	/*
	 * selenium does not differentiate windows or tab it handles only session ID
	 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		//String parent_handle=driver.getWindowHandle();
		//driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		String parent=driver.getWindowHandle();
		System.out.println("title of main page "+parent+" "+driver.getTitle()+" "+driver.getCurrentUrl());
		//new window
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://ineuron-courses.vercel.app/signup");
		System.out.println("  ");
		
		//we get two handles
		
		System.out.println(driver.getWindowHandles());
		System.out.println("  ");
		System.out.println("Title of the child page after switching to new tab "+driver.getWindowHandle()+" "+driver.getTitle()+" "+driver.getCurrentUrl());
		//driver.switchTo().window(driver.getWindowHandle());
		driver.close();
		driver.switchTo().window(parent);
		
		System.out.println("Title of the main page after switching back to parent page "+driver.getWindowHandle()+" "+driver.getTitle()+" "+driver.getCurrentUrl());
		//driver.close();
	}
}
