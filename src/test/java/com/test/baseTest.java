package com.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.pages.Page;
import com.pages.basePage;
import com.utilities.readConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	WebDriver driver;
	Page page;

	readConfig read = new readConfig();
	public String URL = read.getApplicationURL();
	public String location = read.getLocation();

	@BeforeMethod
	@Parameters(value = { "browserName" })
	public void setUp(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("BrowserName is not defined correctly" + browserName);
		}
		driver.manage().window().maximize();
		driver.get(URL);
		page = new basePage(driver);

	}

	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}
}
