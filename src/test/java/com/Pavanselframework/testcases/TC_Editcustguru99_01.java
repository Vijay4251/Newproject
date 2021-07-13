package com.Pavanselframework.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.EditCust;
import com.Pavanselframework.pageobjects.LoginpageGuru99;

public class TC_Editcustguru99_01 extends BaseClass {
	
	@Test
	public void editcust() throws InterruptedException, IOException{
		
		LoginpageGuru99 lp = new LoginpageGuru99(driver);
		
		lp.setusername(username);
		logger.info("username provided");
		
		lp.setpassword(password);
		logger.info("password provided");
		
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		EditCust custed = new EditCust(driver);
		custed.clickeditcustomer();
		custed.customerid("23325");
		
		custed.cstsubmit();
	   // driver.findElement(By.name("BANGLORE")).clear();
		
		custed.cleartxtcity("mumbai");
	
		//custed.custcity("yadgir");
		custed.csubmit();
		
		Thread.sleep(3000);
		

		boolean res1 = driver.getPageSource().contains("Customer details updated Successfully!!!");
		if(res1==true)
		{
			Assert.assertTrue(true);
			logger.info("login pass");
		}
		else
		{
			capturescreen(driver , "editcust");
			Assert.assertTrue(false);
			logger.info("login fail");
		}
		
		
	}

}
