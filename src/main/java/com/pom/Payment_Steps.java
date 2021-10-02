package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Steps {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement summary;
	
	public Payment_Steps(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummary() {
		return summary;
	}

	public void setSummary(WebElement summary) {
		this.summary = summary;
	}

	public WebElement getAddress() {
		return Address;
	}

	public void setAddress(WebElement address) {
		Address = address;
	}

	public WebElement getShippingAgree() {
		return shippingAgree;
	}

	public void setShippingAgree(WebElement shippingAgree) {
		this.shippingAgree = shippingAgree;
	}

	public WebElement getShippingsubmit() {
		return shippingsubmit;
	}

	public void setShippingsubmit(WebElement shippingsubmit) {
		this.shippingsubmit = shippingsubmit;
	}

	public WebElement getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(WebElement payment_mode) {
		this.payment_mode = payment_mode;
	}

	public WebElement getConfirm_order() {
		return confirm_order;
	}

	public void setConfirm_order(WebElement confirm_order) {
		this.confirm_order = confirm_order;
	}

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Address;
	
	@FindBy(id="cgv")
	private WebElement shippingAgree;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement shippingsubmit;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payment_mode;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm_order;
	

}
