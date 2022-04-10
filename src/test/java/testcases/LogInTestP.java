package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.LogInPage;

public class LogInTestP {
	
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		LogInPage loginpage= new LogInPage(driver);
		
		
		loginpage.invokeURL();
		loginpage.enterUserName();
		loginpage.enterPassword();
		loginpage.hitSubmit();
		
		
	}

}
