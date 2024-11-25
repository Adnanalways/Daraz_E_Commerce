package daraz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (130)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
	}
	@Test
	public void login() {
		
	
	}
	@AfterClass
	public void teardown() {
		if (driver !=null) {
			driver.quit();
		}
	}

}
