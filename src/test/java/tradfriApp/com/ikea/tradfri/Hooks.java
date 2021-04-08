package tradfriApp.com.ikea.tradfri;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;

public class Hooks {
	
	private static final String packageName = "com.ikea.tradfri.lighting";
	WebDriver driver;
	
	public void setUp(ITestContext context) {
		
		Driver driver = new Driver();
		
		String deviceName = "Samsung Galaxy A31";
		String deviceId = "RZ8N81ZYGBP";
		String platformVersion = "10";
		String platformName = "Android";
		String appURL = "C:\\Users\\tarun\\Desktop\\AndroidApp.apk";
		String serverIP = "127.0.0.1";
		String appiumPort  = "4723";
		
		
		AppiumDriver appiumDriver = driver.getDriver(deviceName, deviceId, platformName, platformVersion, appURL, serverIP, appiumPort );
		context.setAttribute("driver", appiumDriver);

	}
	
}
