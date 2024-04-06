package SwitchToCommandsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichToWindow4 {
	/*
	 * TASK
	 * First click on all social media link this will open 4 media link + 1 parent
	 * write a logic that will switch to windows/tab which title contains twitter
	 */
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
	}
}
