package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsCommand {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(5000);
		
		Options opt= driver.manage();
		Window win= opt.window();
		win.maximize();
		driver.get("https://www.linkedin.com");
		win.minimize();
		win.maximize();
		win.fullscreen();
		
	}
}
