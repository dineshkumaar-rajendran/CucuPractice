package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoPage_POM {
	private WebDriver driver;

	private By TextBox = By.xpath("//*[@type='text']");
	private By Search_btn = By.xpath("(//*[@value='Google Search'])[1]");
	
	public demoPage_POM(WebDriver driver) {
		this.driver=driver;
	}

	public void enter_Text(String Values) {
		driver.findElement(TextBox).sendKeys(Values);
	}

	public void click_searchBtn() {
		driver.findElement(Search_btn).click();
	}
}
