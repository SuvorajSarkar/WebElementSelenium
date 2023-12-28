package WebDriverCommands;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsCommand2 {
	/*
	 * Option- manage cookies,timeouts,windows
	 * Window- manage window
	 * 
	 * 
	 * WebElement-Interface-- which represent element on page
	 * */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().setSize(new Dimension(0,0));
	}
}
