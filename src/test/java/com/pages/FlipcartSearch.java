package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FlipcartSearch {
	WebDriver driver;

	public FlipcartSearch(WebDriver driver) {
    this.driver = driver;
	}

	By remove = By.className("_2doB4z");
	By search = By.name("q");

	By heading = By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]");
	public void clickOn() {
		driver.findElement(remove).click();

	}

	public void entertext(String value) {
		driver.findElement(search).sendKeys(value + Keys.ENTER);
	}

	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
	//String Url = driver.getCurrentUrl();
	
	}