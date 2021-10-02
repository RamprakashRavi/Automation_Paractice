package com.Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin_Project extends Base_Class {
	
	public static void main(String[] args) throws Throwable {
		
		getBrowser("chrome");
		sleep(2000);
		geturl("https://adactinhotelapp.com/");
		sleep(2000);
		
		//Home_page
		WebElement user = driver.findElement(By.id("username"));
	    inputvalues(user, "ramprakash745218");
	    WebElement pass = driver.findElement(By.id("password"));
	    inputvalues(pass, "Ram@4066");
	    WebElement login = driver.findElement(By.id("login"));
	    clickonelement(login);
	    sleep(2000);
	    
	    
	    //search hotel_page
	    WebElement location = driver.findElement(By.id("location"));
	    waitimplicit(3);
	    selectby(location, "index", "2");
	    WebElement hotels = driver.findElement(By.id("hotels"));
	    waitimplicit(3);
	    selectby(hotels, "visible text", "Hotel Sunshine");
	    WebElement room_type = driver.findElement(By.id("room_type"));
	    waitimplicit(3);
	    selectby(room_type, "index", "2");
	    WebElement no_of_rooms = driver.findElement(By.id("room_nos"));
	    waitimplicit(3);
	    selectby(no_of_rooms, "value", "3");
	    WebElement date_in = driver.findElement(By.id("datepick_in"));
	    waitimplicit(2);
	    clear_data(date_in);
	    inputvalues(date_in, "25/09/2021");
	    sleep(3000);
	    WebElement date_out = driver.findElement(By.id("datepick_out"));
	    waitimplicit(2);
	    clear_data(date_out);
	    inputvalues(date_out, "1/10/2021");
	    sleep(3000);
	    WebElement adult_room = driver.findElement(By.id("adult_room"));
	    waitimplicit(2);
	    selectby(adult_room, "value", "2");
	    WebElement child_room = driver.findElement(By.id("child_room"));
	    waitimplicit(2000);
	    selectby(child_room, "value", "1");
	    WebElement search = driver.findElement(By.id("Submit"));
	    clickonelement(search);
		sleep(2000);
		
		//select_hotel
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		clickonelement(select);
		sleep(1000);
		WebElement contin = driver.findElement(By.id("continue"));
		clickonelement(contin);
		sleep(2000);
		
		
		//Book Hotel
		
		WebElement First_name = driver.findElement(By.name("first_name"));
		inputvalues(First_name, "Ram");
		waitimplicit(2);
		WebElement last_name = driver.findElement(By.id("last_name"));
		inputvalues(last_name, "prakash");
		waitimplicit(2);
		WebElement bill_address = driver.findElement(By.id("address"));
		inputvalues(bill_address, "Chennai");
		waitimplicit(2);
		WebElement credit_no = driver.findElement(By.id("cc_num"));
		inputvalues(credit_no, "1234567890123456");
		waitimplicit(5);
		WebElement card_type = driver.findElement(By.id("cc_type"));
		selectby(card_type, "value","MAST");
		waitimplicit(2);
		WebElement valid_month = driver.findElement(By.id("cc_exp_month"));
		selectby(valid_month, "value", "3");
		waitimplicit(2);
		WebElement valid_year = driver.findElement(By.id("cc_exp_year"));
		selectby(valid_year, "value", "2022");
		waitimplicit(2);
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		inputvalues(ccv, "123");
		waitimplicit(2);
		WebElement book = driver.findElement(By.id("book_now"));
		clickonelement(book);
		
		
		//Book_confirmation
		waitimplicit(5);
		WebElement confirmation = driver.findElement(By.id("my_itinerary"));
		clickonelement(confirmation);
		sleep(2000);
		screenshot("Adactin");
		
		
		//Book iterator
		waitimplicit(5);
		WebElement logout = driver.findElement(By.id("logout"));
		clickonelement(logout);
		sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
