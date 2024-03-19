package test;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
public class payBills extends TestBase{
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
	@Test(description = "Airtime & Data",priority=1)
	public void Airtime() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("Home"))).isDisplayed();
		driver.findElement(By.xpath(utils.fetchLocators("payBills"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("airtime&data"))).click();
		//AIRTIME
		driver.findElement(By.xpath(utils.fetchLocators("chooseNet"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("airtelMobileTopUp"))).click();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("choosePlan"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("plan"))).click();
		//driver.findElement(By.xpath(utils.fetchLocators("cancelx"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("enterPhNum"))).sendKeys(utils.fetchLocators("phoneTxt"));
		driver.findElement(By.xpath(utils.fetchLocators("acctToDebit"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("slcacctToDebit"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("confirmx"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("proceedx"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("pinFldx"))).sendKeys(utils.fetchLocators("pinTxtx"));
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		boolean state = 
		driver.findElement(By.xpath(utils.fetchLocators("successfulMessagePopUp"))).isDisplayed();
		if(state==true) {
			System.out.println("Yaay! is Displayed");
		}else {
			System.out.println("Impossible");
		}
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("exitIcon"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("payBills"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("airtime&data"))).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("dataIcon"))).click();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("chooseNets"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("dataMobileTopUp"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("choosePlanx"))).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("planx"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("wirelessPhNumx"))).sendKeys(utils.fetchLocators("wirelessphoneTxts"));
		driver.findElement(By.xpath(utils.fetchLocators("acctToDebitx"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("slcacctToDebitx"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("confirmxx"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("proceedxx"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("pinFldxx"))).sendKeys(utils.fetchLocators("pinTxtxx"));
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.findElement(By.xpath(utils.fetchLocators("oppsIcon"))).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(utils.fetchLocators("goBackx"))).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
	}
	@Test(description = "International Airtime&Data",priority=2)
	public void Data() throws Exception {
		driver.findElement(By.xpath(utils.fetchLocators("intAirtime&Data"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("chooseNetxy"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("netxy"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("choosePlanxy"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("planxy"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("numberx"))).sendKeys(utils.fetchLocators("numberxTxt"));
		try {
			scrollAndClick("Select account to debit");
			driver.findElement(By.xpath("//android.widget.TextView[@text='Select account to debit']")).click();
			}
			catch(Exception Debit) {
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup\r\n")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
//		driver.findElement(By.xpath(utils.fetchLocators("acctToDebitxy"))).click();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(utils.fetchLocators("slcacctToDebitxy"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("confirmxy"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("proceedx"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("pinFldx"))).sendKeys(utils.fetchLocators("pinTxtx"));
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
	}
	private void scrollAndClick(String visibleText) {
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
		// TODO Auto-generated method stub
	     
		
	}
	
}

