package com.test;

import org.testng.annotations.Test;

import com.pages.homePage;


public class searchTest extends baseTest{
	
	
	@Test
	public void doSearch() {
		page.getInstance(homePage.class).doSearch(location);
	}
}
