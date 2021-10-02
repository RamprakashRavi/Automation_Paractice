package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
    private WebElement Dresses;
	
	public Purchase_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public void setDresses(WebElement dresses) {
		Dresses = dresses;
	}

	public WebElement getEvedresses() {
		return Evedresses;
	}

	public void setEvedresses(WebElement evedresses) {
		Evedresses = evedresses;
	}

	public WebElement getSize() {
		return size;
	}

	public void setSize(WebElement size) {
		this.size = size;
	}

	public WebElement getImage() {
		return image;
	}

	public void setImage(WebElement image) {
		this.image = image;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}

	@FindBy(xpath="(//a[.='Evening Dresses'])[3]")
	private WebElement Evedresses;
	
	@FindBy(id="layered_id_attribute_group_3")
	private WebElement size;
    
    @FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
    private WebElement image;
    
    @FindBy(xpath="//a[@title='Add to cart']")
    private WebElement addtocart;
    

}
