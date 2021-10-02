package org.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.pom.Add_to_cart;
import org.pom.Home_pag;
import org.pom.Moblie_poco;

public class Page_Object {
	
	public WebDriver driver;
	
	private Home_pag HP;
	private Moblie_poco MP;
	private Add_to_cart AD;
	
	
	
	public Page_Object(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Home_pag getinstanceh() {
		 HP = new Home_pag(driver);
		return HP;
		
	}
	
	public Moblie_poco getinstancem() {
	    MP = new Moblie_poco(driver);
		return MP;

	}
	
	public Add_to_cart getinstancea() {
	    AD=new Add_to_cart(driver);
		return AD;

	}

}
