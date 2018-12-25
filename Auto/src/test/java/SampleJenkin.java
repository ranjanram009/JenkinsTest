import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jdk.jfr.internal.Logger;
 

public class SampleJenkin{

	WebDriver driver;
	
	@Test 
	 public void login() {
		
		
		driver.get("https://www.primevideo.com/ref=av_auth_return_redir");
		
		driver.manage().window().maximize();
		
		String title ="Welcome to Prime Video";
		System.out.println("Validation ");
		
		Assert.assertEquals(driver.getTitle(),title);
		
		System.out.println("Git hub testing ");
	}
	@BeforeClass
	public void beforeLogin() {
	System.setProperty("webdriver.chrome.driver","./support/chromedriver.exe");
	
	driver= new ChromeDriver();
	
	System.out.println("Before Login done");
	}
	
	@AfterClass
	public void afterLogin() throws InterruptedException {
		
		Thread.sleep(5000);
		
		System.out.println("Exiting the application");
		
		driver.quit();
	}

}
