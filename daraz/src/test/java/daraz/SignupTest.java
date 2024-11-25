package daraz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignupTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (130)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
	}
	
	@Test
	public void loginpage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"anonSignup\"]/a")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your phone number\"]")).sendKeys("01939427812");
		driver.findElement(By.xpath("//div [@class=\"iweb-checkbox-icon iweb-checkbox-icon--box\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div [@class=\"iweb-button-mask\"]")).click();
		
	}
	@Test
	public void createaccount() {
		System.out.println("Already have an account?");
	}
	@AfterClass
	public void teardown() {
		if (driver !=null) {
			driver.quit();
		}
	}
	
}
