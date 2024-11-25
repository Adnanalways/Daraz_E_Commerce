package daraz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPnumber {
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (130)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
	}
	@Test
	public void loinpnumber() {
		driver.findElement(By.cssSelector("#anonLogin > a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div[2]/div/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your phone number\"]")).sendKeys("01939427812");
		driver.findElement(By.xpath("//div[@class=\"iweb-button-mask\"]")).click();
	}
	@Test
	public void login() {
		System.out.println("login successfull");
	}

}
