package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Home_Page;
import com.pom.Payment_Steps;
import com.pom.Proceed_To;
import com.pom.Purchase_page;
import com.pom.SignIn_page;

public class Page_Object_Manager {
	
	public  WebDriver driver;
	
	private Home_Page hp;
	private SignIn_page sp;
	private Purchase_page pp;
	private Proceed_To pt;
	private Payment_Steps ps;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Home_Page getInstanceHp() {
		 hp = new Home_Page(driver);
		 return hp;

		 
	}
	public SignIn_page getInstancesp() {
		 sp = new SignIn_page(driver);
		return sp;

	}
	public Purchase_page getInstancepp() {
		 pp = new Purchase_page(driver);
		return pp;

	}
	public Proceed_To getInstancept() {
		 pt = new Proceed_To(driver);
		return pt;

	}
	public Payment_Steps getInstanceps() {
		 ps = new Payment_Steps(driver);
		return ps;

	}
	
	

}
