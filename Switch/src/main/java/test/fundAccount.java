package test;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
public class fundAccount extends TestBase{
	@BeforeTest
	public void setup() throws Exception{
		System.out.println("SWITCH MOBILE AUTOMATION TEST HAS STARTED");
		Thread.sleep(20000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("notification"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(description = "Fund Account",priority=1)
	public void ValidLoginTestToHomepage() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("Home"))).isDisplayed();
		driver.findElement(By.xpath(utils.fetchLocators("fundBtn"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("amouFld"))).sendKeys(utils.fetchLocators("amount"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("destinationAcct"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("wallet"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("selectCard"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("cancel"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("pay"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("goBack"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("newDebitCard"))).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("test"))).isDisplayed();
		System.out.println("TEST is Displayed");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("declined"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("bankAuth"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("success"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("pay"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		boolean state = 
				driver.findElement(By.xpath(utils.fetchLocators("paymentCompleted"))).isDisplayed();
		if(state==true) {
			System.out.println("Payment Completed is Displayed");
		}else {
			System.out.println("Dey Play");
		}
		driver.findElement(By.xpath(utils.fetchLocators("checkAccount"))).click();
		


		
	}


}

