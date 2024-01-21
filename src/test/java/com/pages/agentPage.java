package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class agentPage extends basePage {
	private By agentName = By.xpath("//div[@class='clearfix']//h1");
	
	public String getAgentName() {
		return getElement(agentName).getText();
	}

	public agentPage(WebDriver driver) {
		super(driver);
	}

}
