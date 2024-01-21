package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage extends basePage {

	private By locationTxtBox = By.id("autosuggest-input");
	private By searchBtn = By
			.xpath("//button[@class='_1e1bacc0 _1e1bacc1 _1e1bacc2 _1e1bacc9 _1cvp8fm8' and contains(.,'Search')]");

	public homePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * @return the locationTxtBox
	 */
	public WebElement getLocationTxtBox() {
		waitForElementPresent(locationTxtBox);
		return getElement(locationTxtBox);
	}

	/**
	 * @return the searchBtn
	 */
	public WebElement getSearchBtn() {
		waitForElementPresent(searchBtn);
		return getElement(searchBtn);
	}
	
	public searchResultPage doSearch(String location) {
		getLocationTxtBox().sendKeys(location);
		getSearchBtn().click();
		
		return getInstance(searchResultPage.class);
	}

}
