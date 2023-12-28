package WebDriverCommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigationCommands2 {
	public static void main(String[] args) {
		
		/*
		 * Diff b/w get vs navigate().to()
		 * 
		 * */
		WebDriver driver=new ChromeDriver();
		//method overloading String & URL
		driver.navigate().to("https://www.google.com");
		//driver.navigate().to("");
	}
}
