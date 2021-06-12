package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class WebAppTest {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
	       
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "redmi");
        cap.setCapability("browserName", "chrome");
        cap.setCapability("chromedriverExecutable","C:\\Users\\sk59152\\Desktop\\Automation\\java_workspace\\MoblieAutomation\\src\\test\\resources\\Driver\\chromedriver.exe" );
        
        //send DesiredCapabilities details to the appium server
        AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://magento.com/");
        driver.findElementByXPath("//span[contains(text(),'Sign in')]").click();
        driver.findElementByXPath("//input[@id='email']").sendKeys("balaji007@gmail.com");
        //driver.findElementById("pass").sendKeys("balaji@12345");
        driver.findElementByXPath("//div[@class='field password required spectrum-Form-item']//input[@id='pass']").sendKeys("balaji@12345");
        driver.findElementByXPath("//button[@id='send2']").click();
        driver.getKeyboard();
        
       // driver.quit();
        Thread.sleep(5000);
		if (driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		driver.findElementByXPath("//div[@class='login-form__bottom']//button[@id='send2']").click();

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Log Out']")));

		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	}

}
