package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Moblie_poco {
	
	public WebDriver driver;
	
	
	
	@FindBy(xpath="(//div[.='Mobiles'])[2]")
	private WebElement mobile;
	
	public Moblie_poco(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAssured() {
		return Assured;
	}

	public WebElement getPoco() {
		return poco;
	}

	@FindBy(xpath="//div[@class='_24_Dny _3tCU7L']")
	private WebElement Assured;
	
	@FindBy(xpath="(//img[@class='_396cs4 _3exPp9'])[1]")
	private WebElement poco;

	}


