package base;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Utility.utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class TestBase {
	
	public AndroidDriver driver;
	protected utilities utils = new utilities();
	@BeforeTest
	public void setupTest() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
//		String projectLocation= System.getProperty("user.dir");
//		String appPath = projectLocation+"\\app\\app-prod-release.apk";
		//Setting capabilities
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "Galaxy A50");
		caps.setCapability("version", "11");
		caps.setCapability("ignoreHiddenApiPolicyError", "true");
		caps.setCapability("appActivity", "ng.sterling.sterlingswitch.MainActivity");
		caps.setCapability("appPackage", "ng.sterling.sterlingswitch");
//		caps.setCapability(MobileCapabilityType.APP, appPath);
		caps.setCapability("clearSystemFiles", true);
				
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}
	
//	public void navigateToLandingPage() throws Exception{
//		//driver.findElementByAccessibilityId("Open navigation drawer").click();
//		driver.findElementById("co.tractionapp.traction.debugTest:id/action_logout").click();
//		Thread.sleep(5000);
//		driver.findElementById("android:id/button1").click();
//		Thread.sleep(5000);
//	}
//	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
	
}