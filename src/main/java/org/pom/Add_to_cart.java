package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_cart {
	
	public WebDriver driver;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement Addtocart;
	
	public Add_to_cart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}

	public WebElement getOrder() {
		return order;
	}

	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button")
	private WebElement order;

}
