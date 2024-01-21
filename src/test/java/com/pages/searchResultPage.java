package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchResultPage extends basePage {

	private By priceValue = By.className("_64if862 _1cvp8fm6");

	/**
	 * @return the priceValue
	 */
	public String getPriceValue() {
		return getElement(priceValue).getText();
	}

	public propertyDetailPage clickOnProperty(int number) {

		By clickElement = By.xpath("//div[@class='dkr2t82'][" + number + "]//h2");
		getElement(clickElement).click();
		return getInstance(propertyDetailPage.class);
	}

	public searchResultPage(WebDriver driver) {
		super(driver);
	}

}
