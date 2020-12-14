package com.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.AmazonSearch;
import com.pages.FlipcartSearch;

public class PriceCompareTest {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}

	@Test

	public void ComparePrice() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak52817\\eclipse-selenium\\ProjectWork\\src\\main\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FlipcartSearch fs = new FlipcartSearch(driver);
		fs.clickOn();
		fs.entertext("Apple iPhone XR 128GB Black");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String str = fs.getHeading();
		String value = str.substring(1);
		String price = value.replace(",", "");

		driver.navigate().to("https://www.amazon.in/");
		AmazonSearch am = new AmazonSearch(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		am.entertext1("Apple iPhone XR 128GB Black");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String str1 = am.getHeading();
		String price1 = str1.replace(",", "");

		if (Integer.parseInt(price1) == Integer.parseInt(price1)) {
			System.out.printf("both prices  are equal" + "\n"+ price);
			
		} else if (Integer.parseInt(price1) > Integer.parseInt(price)) {
			System.out.printf("Flipcart has more value" + price1);
		} else if (Integer.parseInt(price1) < Integer.parseInt(price)) {
			System.out.printf("Amazon has more value" + price);
			Assert.assertEquals(price, price1, "both are equalprice1");
			driver.quit();

		}
	}

	

}
