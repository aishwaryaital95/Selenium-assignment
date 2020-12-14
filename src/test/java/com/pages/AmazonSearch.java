package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonSearch {
	WebDriver driver;

	public AmazonSearch(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By heading = By.xpath(
			"//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/a/span[1]/span[2]/span[2]");

	By search = By.name("field-keywords");
	public void entertext1(String value) {
		driver.findElement(search).sendKeys(value + Keys.ENTER);
	}

	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
}
