package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class basePage extends Page {

	public basePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		List<WebElement> elements = null;

		try {
			elements = driver.findElements(locator);
			for (WebElement element : elements) {
				return element;
			}
		} catch (Exception e) {
			System.out.println("Some error occured while creating element" + locator.toString());
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("Some error occured while waiting for element" + locator.toString());
		}

	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		} catch (Exception e) {
			System.out.println("Some error occured while waiting for element" + title);
		}

	}

}
