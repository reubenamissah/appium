package test;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
public class home extends TestBase{
	@BeforeTest
	public void setup() throws Exception{
		System.out.println("TEST TO VALIDATE THE HOMEPAGE HAS STARTED");
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
	@Test(description = "Home verification",priority=1)
	public void ValidLoginTestToHomepage() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		boolean state = 
				driver.findElement(By.xpath(utils.fetchLocators("account"))).isDisplayed();
		if(state==true) {
			System.out.println("Account is Displayed");
		}else {
			System.out.println("Account No dey ooo");
		}
		driver.findElement(By.xpath(utils.fetchLocators("profile"))).isDisplayed();
		if(state==true) {
			System.out.println("Profile is Displayed");
		}else {
			System.out.println("No Profile yet");
		}
		driver.findElement(By.xpath(utils.fetchLocators("Home"))).isDisplayed();
		if(state==true) {
			System.out.println("Home is Displayed");
		}else {
			System.out.println("Ain't going home");
		}
		driver.findElement(By.xpath(utils.fetchLocators("sendMoney"))).isDisplayed();
		if(state==true) {
			System.out.println("Send Money is Displayed");
		}else {
			System.out.println("Send money early during salary week...lol");
		}
		driver.findElement(By.xpath(utils.fetchLocators("fundAccount"))).isDisplayed();
		if(state==true) {
			System.out.println("Fund Account is Displayed");
		}else {
			System.out.println("Kindly fund your empty account...lol");
		}
		driver.findElement(By.xpath(utils.fetchLocators("payBills"))).isDisplayed();
		if(state==true) {
			System.out.println("Pay Bills is Displayed");
		}else {
			System.out.println("Pay your bills");
		}
		driver.findElement(By.xpath(utils.fetchLocators("travelLifestyle"))).isDisplayed();
		if(state==true) {
			System.out.println("Travel & Lifestyle is Displayed");
		}else {
			System.out.println("I want to go for a tour`	`	`		```");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		try {
			scrollAndClick("Invite your friends");
			driver.findElement(By.xpath("//android.widget.TextView[@text='Invite your friends']")).click();
			}
			catch(Exception SendMoney) {
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]\r\n")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		driver.findElement(By.xpath(utils.fetchLocators("viewAll"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	private void scrollAndClick(String visibleText) {
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
		// TODO Auto-generated method stub
		
	}


}

