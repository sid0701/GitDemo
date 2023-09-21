package StaticWebDriver3.StaticWebDriver3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void setup() {
		driver = new ChromeDriver();
	}
	

}
