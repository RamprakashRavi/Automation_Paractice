package com.Automation_Practice;

import org.openqa.selenium.WebDriver;

import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Mini_Project_02 extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {
		waitimplicit(10);
		String url = File_Reader_Manager.getInstance().getinstanceCR().getUrl();
		geturl(url);
		sleep(3000);
        clickonelement(pom.getInstanceHp().getSign_in());
		sleep(3000);
        String user = File_Reader_Manager.getInstance().getinstanceCR().getUsername();
		inputvalues(pom.getInstancesp().getUsername(), user);
		String pass = File_Reader_Manager.getInstance().getinstanceCR().getPassword();
		inputvalues(pom.getInstancesp().getPassword(), pass);
		clickonelement(pom.getInstancesp().getSign_in());
		sleep(3000);
		clickonelement(pom.getInstancepp().getDresses());
		clickonelement(pom.getInstancepp().getEvedresses());
		clickonelement(pom.getInstancepp().getSize());
		sleep(2000);
		moveto(pom.getInstancepp().getImage());
		sleep(2000);
		clickonelement(pom.getInstancepp().getAddtocart());
		clickonelement(pom.getInstancept().getProceed());
		sleep(2000);
		clickonelement(pom.getInstanceps().getSummary());
		clickonelement(pom.getInstanceps().getAddress());
		clickonelement(pom.getInstanceps().getShippingAgree());
		clickonelement(pom.getInstanceps().getShippingsubmit());
		clickonelement(pom.getInstanceps().getPayment_mode());
		clickonelement(pom.getInstanceps().getConfirm_order());
		sleep(2000);
		screenshot("des");

//	
//		SignIn_page s = new SignIn_page(driver);
//		inputvalues(s.getUsername(), "ramprakash40625@gmail.com");
//		inputvalues(s.getPassword(),  "12345");
//		clickonelement(s.getSign_in());
//		sleep(2000);
//		
//		Purchase_page p = new Purchase_page(driver);
//		clickonelement(p.getDresses());
//		sleep(2000);
//		clickonelement(p.getEvedresses());
//		sleep(2000);
//		clickonelement(p.getSize());
//		sleep(2000);
//		moveto(p.getImage());
//		sleep(2000);
//		clickonelement(p.getAddtocart());
//		waitimplicit(5);
//		
//		Proceed_To add = new Proceed_To(driver);
//		clickonelement(add.getProceed());
//		sleep(2000);
//		
//		Payment_Steps pay = new Payment_Steps(driver);
//		clickonelement(pay.getSummary());
//		sleep(2000);
//		clickonelement(pay.getAddress());
//		sleep(2000);
//		clickonelement(pay.getShippingAgree());
//		sleep(2000);
//		clickonelement(pay.getShippingsubmit());
//		sleep(2000);
//		clickonelement(pay.getPayment_mode());
//		sleep(2000);
//		clickonelement(pay.getConfirm_order());
//		sleep(2000);
//		
//		

	}

}
