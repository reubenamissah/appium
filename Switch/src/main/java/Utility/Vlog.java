package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class Vlog extends TestBase{
	@Test
	public void login() throws Exception {
		System.out.println("SWITCH MOBILE AUTOMATION TEST HAS STARTED");
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("notification"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("skipBtn"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(utils.fetchLocators("login"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("emailField"))).sendKeys(utils.fetchLocators("email"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("passwordField"))).sendKeys(utils.fetchLocators("password"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("loginBtn"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("NoBiometrics"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
}
	
	private void exit() {
    	driver.quit();
	}

	public void vlog() {
		// TODO Auto-generated method stub
		
	}

}