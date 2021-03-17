package com.base.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebConnector {
	
	WebDriver driver;
	
	public WebConnector() {	
	}

	public void launchBrowser(String browser) {
		// decide which browser to open
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void navigateTo(String url) {
		driver.get(url);
	}

	public void enterTextinInputTextField(String inputText, String fieldXpath) {
		driver.findElement(By.xpath(fieldXpath)).sendKeys(inputText);
	}
	
	

}
