package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public WebDriver driver;
	public static   WebDriver startApplication(WebDriver driver,String browserName,String appUrl) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ak52817\\eclipse-selenium\\ProjectWork\\src\\main\\resources\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ak52817\\selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new FirefoxDriver();
			
		}
		else {
			
			System.out.println("we do not support this browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
}
}