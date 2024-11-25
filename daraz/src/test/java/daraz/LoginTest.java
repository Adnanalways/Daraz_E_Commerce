package daraz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (130)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.cssSelector("#anonLogin > a")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("adnanjoybi760@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("cse06307482");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div[2]/div/div[2]/button/div")).click();
		
	    if(driver.getPageSource().contains("welcome")) {
	    	System.out.println("login sucessful");
	    }else if(driver.getPageSource().contains("incorrect email or password")) {
	    	System.out.println("login failed:incorrect email or password");
	    }else {
	    	System.out.println("login result un clear,please check manually");
	    }
	}
	
	}


