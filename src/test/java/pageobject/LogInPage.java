package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	WebDriver driver;
	
	public LogInPage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }
	
	
	
	//locator
	
	@FindBy(name="userName") WebElement userName;
	@FindBy(name="password") WebElement password;
	@FindBy(name="submit") WebElement submit;

    
	
	
	
	//action methods
	
	public void invokeURL() {
		driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	public void enterUserName() {
		userName.sendKeys("abc");
		
	}
	
	public void enterPassword() {
		password.sendKeys("1234");
	}
	
	public void hitSubmit() {
		submit.click();
	}
	
	
	
	
	
	
	

	
	

}
