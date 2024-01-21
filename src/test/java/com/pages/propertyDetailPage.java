package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class propertyDetailPage extends basePage {

	private By agentName = By.className("_1fnpa5a3 _1cvp8fm6");
	private By agentDetails = By.className("_1fnpa5a0 _1cvp8fm8");

	public String getAgentName() {
		return getElement(agentName).getText();
	}

	public agentPage clickOnAgent() {
		getElement(agentDetails).click();
		return getInstance(agentPage.class);

	}

	public propertyDetailPage(WebDriver driver) {
		super(driver);
	}

}
