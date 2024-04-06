package Handle_calender_controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HAndle_calender1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/");
		//Option-1 if application is support
		driver.findElement(By.id("datepicker")).sendKeys("03/06/2023");
		driver.close();
	}
	
}
