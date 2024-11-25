package daraz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Producsearch {
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (130)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/#hp-flash-sale");
	}
	@Test
	public void productsearch() {
		driver.findElement(By.xpath("//input[@id=\"q\"]")).sendKeys("laptop bag");
		driver.findElement(By.xpath("//a[contains(@class, 'search-box__button--1oH7')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div/a/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"module_add_to_cart\"]/div/button[2]")).click();
	}

}
