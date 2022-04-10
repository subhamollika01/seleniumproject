package testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {

	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdmha\\Documents\\workspace-spring-tool-suite-4-4.13.0.RELEASE\\seleniumproject\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.findElement(By.name("userName")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
	}
	
	

}
