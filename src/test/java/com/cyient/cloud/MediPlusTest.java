package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MediPlusTest {

	public static void main(String[] args) throws MalformedURLException, Throwable {
		DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "surajkumar_8z7Gma");
	      caps.setCapability("browserstack.key", "zshybPNG4XqyHjzRscjC");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://cc7c0e910219ac11fd81e93f88a349e7814bbe40");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First Java Project-suraj-medplus");
	      caps.setCapability("build", "Java Android-medplus");
	      caps.setCapability("name", "first_test_medplus");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	      
	      AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://hub.browserstack.com/wd/hub"),caps);

	        

	      /* Write your Custom code here */
	        driver.findElementByXPath("//*[@text='Account']").click();
			
			driver.findElementByXPath("//android.widget.EditText").sendKeys("suraj");



			driver.findElementByXPath("(//android.widget.EditText)[2]").sendKeys("kumar");
			//android.widget.EditText

			driver.findElementByXPath("//*[@text='Sign In']").click();
	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	        System.out.println(driver.getPageSource());
	        System.out.println(driver.getPlatformName());
	        System.out.println(driver.getDeviceTime());
	       driver.quit();

	}

}
