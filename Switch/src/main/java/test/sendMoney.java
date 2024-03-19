package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;




public class sendMoney extends TestBase{
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
	@Test(description = "Send Money",priority=1)
	public void BankAccounts() throws Exception {
//		Vlog vlog = new Vlog();
//		Thread.sleep(40000);
//		vlog.login();
//		Thread.sleep(50000);
		boolean state = driver.findElement(By.xpath(utils.fetchLocators("sendMoney"))).isDisplayed();
		if(state==true) {
			System.out.println("Send Money is Displayed");
			driver.findElement(By.xpath(utils.fetchLocators("sendMoney"))).click();
		}else {
			System.out.println("HEY, STAY SAFE");
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(utils.fetchLocators("sendMoney"))).click();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("bankAcct"))).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath(utils.fetchLocators("acctToDebitFld"))).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("acctToDebit"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("enterAmountFld"))).sendKeys(utils.fetchLocators("amount"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("slctBankFld"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("searchFld"))).sendKeys(utils.fetchLocators("searchTxt"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("gtBank"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("benAcctNumberFld"))).sendKeys(utils.fetchLocators("acctNumberTxt"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("saveAsBen"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("confiBtn"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("unableOk"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("enterAvalidAcctNumOK"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("goBack"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
		
	}
	@Test(priority=2)
	public void SwitchWallets() throws Exception {
		System.out.println("Switch wallets test started");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("switchwallets"))).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("enterAmountFld"))).sendKeys(utils.fetchLocators("amount"));
		driver.findElement(By.xpath(utils.fetchLocators("selectBen"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("beneficiary"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("confirmBtn"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("proceedBtn"))).click();
		driver.findElement(By.xpath(utils.fetchLocators("pinFld"))).sendKeys(utils.fetchLocators("pin"));

	}
	@Test(priority=3)
	public void Myself() throws Exception {
		System.out.println("Myself test started");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("myself"))).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.findElement(By.xpath(utils.fetchLocators("enterAmoun"))).sendKeys(utils.fetchLocators("amount"));
//		driver.findElement(By.xpath(utils.fetchLocators("selectBen"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("beneficiary"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("confirmBtn"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("proceedBtn"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("pinFld"))).sendKeys(utils.fetchLocators("pin"));

	}
	@Test(priority=4)
	public void DomiciliaryAccount() throws Exception {
		System.out.println("Domiciliary Account test started");
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
//		driver.findElement(By.xpath(utils.fetchLocators("domiciliary"))).click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
//		driver.findElement(By.xpath(utils.fetchLocators("enterAmoun"))).sendKeys(utils.fetchLocators("amount"));
//		driver.findElement(By.xpath(utils.fetchLocators("selectBen"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("beneficiary"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("confirmBtn"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("proceedBtn"))).click();
//		driver.findElement(By.xpath(utils.fetchLocators("pinFld"))).sendKeys(utils.fetchLocators("pin"));
//		try {
//			scrollAndClick("Send Money");
//			driver.findElement(By.xpath("//android.widget.Button")).click();
//			}
//			catch(Exception SendMoney) {
//			driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[5]/android.view.ViewGroup[1]/android.widget.Button[1]")).click();
//		}
//		Thread.sleep(10000);
//		//Clicking THE General section
////		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
//	}
//	
//	public void scrollAndClick(String visibleText) {
//	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
	        }

	}


