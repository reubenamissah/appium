package test;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
public class account extends TestBase{
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
	@Test(description = "Account",priority=1)
	public void Account() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		boolean state = 
				driver.findElement(By.xpath(utils.fetchLocators("account"))).isDisplayed();
		if(state==true) {
			System.out.println("Account is Displayed");
		}else {
			System.out.println("Account No dey ooo");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("account"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("wallets"))).isDisplayed();
		if(state==true) {
			System.out.println("Wallet is Displayed");
		}else {
			System.out.println("Where you keep your wallet");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("copyId"))).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(utils.fetchLocators("walletText"))).isDisplayed();
//		if(state==true) {
//			System.out.println("Wallet Text is Displayed");
//		}else {
//			System.out.println("Whhat is wallet saying?");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		}
	}
    @Test(description = "Accounts",priority=2)
    public void Accounts() throws Exception {
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	boolean state = 
			driver.findElement(By.xpath(utils.fetchLocators("accounts"))).isDisplayed();
	if(state==true) {
		System.out.println("Accounts is Displayed");
	}
	else {
		System.out.println("Accounts No dey ooo");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(utils.fetchLocators("accounts"))).click();
	
	driver.findElement(By.xpath(utils.fetchLocators("createAcct"))).isDisplayed();
	if(state==true) {
		System.out.println("Create Account is Displayed");
	}
	else {
		System.out.println("To create account how what happended to sign up");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
    }
	@Test(description = "Linked Account",priority=3)
    public void linkedAccount() throws Exception {
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	boolean state = 
			driver.findElement(By.xpath(utils.fetchLocators("linked"))).isDisplayed();
	if(state==true) {
		System.out.println("Link Account is Displayed");
	}else {
		System.out.println("Can't link");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(utils.fetchLocators("linked"))).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(utils.fetchLocators("linksterlingAccount"))).isDisplayed();
	if(state==true) {
		System.out.println("Link Sterling Account is Displayed");
	}else {
		System.out.println("Can't link");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(utils.fetchLocators("let'sgo"))).isDisplayed();
	if(state==true) {
		System.out.println("Let's Go is Displayed");
	}else {
		System.out.println("Can't go anywhere");
	}
	//driver.findElement(By.xpath(utils.fetchLocators("let'sgo"))).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
}
}


