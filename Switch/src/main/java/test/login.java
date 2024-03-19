package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Utility.utilities;
import base.TestBase;
public class login extends TestBase{
	utilities utils = new utilities();
	
	
	@Test(description = "INVALID LOGIN",priority=1)
	public void InvalidLoginTest() throws Exception{
		System.out.println("TEST TO VALIDATE AN INVALID LOGIN TEST");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("notification"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("skipBtn"))).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(utils.fetchLocators("login"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("emailField"))).sendKeys(utils.fetchLocators("invalidemail"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("passwordField"))).sendKeys(utils.fetchLocators("invalidpassword"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("loginBtn"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean state = 
				driver.findElement(By.xpath(utils.fetchLocators("errorMessage"))).isDisplayed();
		if(state==true) {
			System.out.println("You entered an incorrect email, password, or both");
		}else {
			System.out.println("Dey Play");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("escape"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("emailField"))).clear();
		driver.findElement(By.xpath(utils.fetchLocators("passwordField"))).clear();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	@Test(description = "VALID LOGIN",priority=2)
	public void LoginTest() throws Exception{
		System.out.println("SWITCH MOBILE AUTOMATION TEST HAS STARTED");
		driver.findElement(By.xpath(utils.fetchLocators("emailField"))).sendKeys(utils.fetchLocators("email"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("passwordField"))).sendKeys(utils.fetchLocators("password"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("loginBtn"))).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("NoBiometrics"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		boolean state = 
				driver.findElement(By.xpath(utils.fetchLocators("welcomeMssg"))).isDisplayed();
		if(state==true) {
			System.out.println("Hello, Sylvester");
		}else {
			System.out.println("Dey Play");
		}
		Thread.sleep(50000);
		
	}
	
}