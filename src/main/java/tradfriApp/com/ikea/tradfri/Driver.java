package tradfriApp.com.ikea.tradfri;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Driver {
	
	public AppiumDriver getDriver(String deviceName, String deviceId, String platformName, String platformVersion, String appURL, String serverIP, String appiumPort ) {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", deviceName);
		cap.setCapability("udid", deviceId);
		cap.setCapability("platformName", platformName);
		cap.setCapability("platformVersion", platformVersion);
		cap.setCapability("app", appURL);
		cap.setCapability("noReset", true);
		cap.setCapability("automationName", "uiAutomator2");
		cap.setCapability("newCommandTimeout", "1000");
		cap.setCapability("appPackage", "com.ikea.tradfri.lighting");
		cap.setCapability("appActivity", ".start.activity.SplashActivity");
		
		try {
			String serverURL = "http://" + serverIP + appiumPort + "/wd/hub";
			URL url = new URL(serverURL);
			AppiumDriver driver = new AndroidDriver(url, cap);
			return driver;
		}
		
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			throw new RuntimeException("Appium driver could not be initialised");
		}
		
	}

}
