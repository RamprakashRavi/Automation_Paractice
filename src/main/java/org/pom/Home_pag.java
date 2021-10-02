package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_pag {
	
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	private WebElement Home;

	public Home_pag(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHome() {
		return Home;
	}
	
	
	

}
