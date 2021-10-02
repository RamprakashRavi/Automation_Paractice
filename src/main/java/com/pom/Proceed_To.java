package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_To {
	
	public WebDriver driver;
	
	public Proceed_To(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getProceed() {
		return Proceed;
	}

	public void setProceed(WebElement proceed) {
		Proceed = proceed;
	}

	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement Proceed;
	

}
