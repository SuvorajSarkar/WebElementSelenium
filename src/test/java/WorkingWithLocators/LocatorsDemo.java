package WorkingWithLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("suvoraj");
		/*driver.findElements(By.xpath("//a[contains(text(),'Submit a claim')]")).get(0).click();
		driver.findElements(By.xpath("//a[contains(text(),'Submit a claim')]")).get(1).click();*/
}
}