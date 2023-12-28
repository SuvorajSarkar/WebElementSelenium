package WebDriverCommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.twitter.com");
		driver.get("https://www.linkedin.com");
	    /*Navigation nav=	driver.navigate();
	    nav.back();*/
		//important
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    driver.quit();
	}
}
