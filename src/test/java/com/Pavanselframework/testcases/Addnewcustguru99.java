package com.Pavanselframework.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.Addcustomer;
import com.Pavanselframework.pageobjects.LoginpageGuru99;

import junit.framework.Assert;

public class Addnewcustguru99  extends BaseClass {
	
	@Test
	public void addnewcust() throws InterruptedException, IOException
	{
		LoginpageGuru99 lp = new LoginpageGuru99(driver);
		
		lp.setusername(username);
		logger.info("username provided");
		
		lp.setpassword(password);
		logger.info("password provided");
		
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		Addcustomer addcust = new Addcustomer(driver);
		
		addcust.clickaddcustomer();
		addcust.customername("vijay");
		addcust.gender("male");
		
		addcust.dateb("10","15","1995");
		//Thread.sleep(3000);
		
		addcust.custaddress("INDIA"); 
		addcust.custcity("BANGLORE");
		addcust.custstate("KARNATAK");
		addcust.custpinno("585355");
		addcust.custphone("9164546179");
		
		String email = randomestring() + "@gmail.com";
		addcust.custemail(email);
		addcust.custpass("abcde");
		addcust.csubmit();
		
		Thread.sleep(3000);
		logger.info("validation started");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("login test pass");
		}
		else
		{
			capturescreen(driver , "addnewcust");
			Assert.assertTrue(false);
			logger.info("login test fail");
			
			
		}
		
	}

}
