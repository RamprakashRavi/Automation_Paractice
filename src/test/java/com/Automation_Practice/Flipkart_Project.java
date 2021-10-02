package com.Automation_Practice;

import org.SDP.Page_Object;
import org.openqa.selenium.WebDriver;

public class Flipkart_Project extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static Page_Object po = new Page_Object(driver);

	public static void main(String[] args) throws Throwable {

		geturl("https://www.flipkart.com/");
		sleep(2000);
		clickonelement(po.getinstanceh().getHome());
		sleep(2000);
        clickonelement(po.getinstancem().getMobile());
		waitimplicit(10);
		clickonelement(po.getinstancem().getAssured());
		waitimplicit(10);
		clickonelement(po.getinstancem().getPoco());
		waitimplicit(5);
		tab();
		sleep(3000);
		clickonelement(po.getinstancea().getAddtocart());
		sleep(2000);
		clickonelement(po.getinstancea().getOrder());
		sleep(2000);
		
		
		
		
		
		
		
		
		
		
		

//		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
//		clickonelement(login);
//		sleep(2000);
//		WebElement mobile = driver.findElement(By.xpath("(//div[.='Mobiles'])[2]"));
//		clickonelement(mobile);
//		waitimplicit(10);
//		WebElement Assured = driver.findElement(By.xpath("//div[@class='_24_Dny _3tCU7L']"));
//		clickonelement(Assured);
//		waitimplicit(5);
//		WebElement poco = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]"));
//		clickonelement(poco);
//		waitimplicit(10);
//		tab();	
//		sleep(2000);
//		WebElement addtocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//		clickonelement(addtocart);
//		sleep(2000);
//		WebElement placeorder = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button"));
//		clickonelement(placeorder);
//		sleep(1000);
//		
//		
	}

}
