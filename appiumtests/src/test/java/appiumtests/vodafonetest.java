package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class vodafonetest {
	
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String [] args)
	{
		try {
			vodafonetest();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.getCause();
			e.getMessage();
			e.getStackTrace();
		}
	}
	
	public static void vodafonetest() throws Exception
	{
		
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName","SNE-LX1");	
	cap.setCapability("udid","HVYDU19329010363");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","10");	
	cap.setCapability("appPackage","com.vodafone.selfservis");
	cap.setCapability("appActivity","com.vodafone.selfservis.activities.login.VfLoginSuperNetMultiAccountActivity");
		
	URL url = new URL("http://0.0.0.0:4723/wd/hub");
	
	driver= new AppiumDriver<MobileElement>(url,cap);
	System.out.println("Yanimda is started...");
	
	MobileElement Vodafoneluyum = driver.findElement(By.id(""));
	Vodafoneluyum.click();
	Thread.sleep(2000);
	MobileElement gsm = driver.findElement(By.id(""));
	gsm.sendKeys("05330347766");
	MobileElement password = driver.findElement(By.id(""));
	password.sendKeys("test");
	MobileElement girisYap = driver.findElement(By.id(""));
	girisYap.click();
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
}
