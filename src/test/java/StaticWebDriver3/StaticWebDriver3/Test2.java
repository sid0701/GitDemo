package StaticWebDriver3.StaticWebDriver3;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeClass
	public void setup() {
		System.out.println("Browser setup by thread "+Thread.currentThread().getId());
		BaseTest.setup();
	}

	@Test
	public void FlipkartTest(Method m) throws InterruptedException {
		BaseTest.driver.get("https://www.flipkart.com");
		Thread.sleep(15000);
		System.out.println("Title printed by thread "+m.getName()+"  "+Thread.currentThread().getId()+" "+BaseTest.driver.getTitle());
		BaseTest.driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void MyntraTest(Method m) throws InterruptedException {
		BaseTest.driver.get("https://www.myntra.com");
		Thread.sleep(15000);
		System.out.println("Title printed by thread "+m.getName()+"  "+Thread.currentThread().getId()+" "+BaseTest.driver.getTitle());
		BaseTest.driver.manage().deleteAllCookies();
		
	}
	
	@AfterClass
	public void teardown() {
		BaseTest.driver.close();
	}
	
}
