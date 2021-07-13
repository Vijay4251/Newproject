package com.Pavanselframework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.Loginpage1Swaglabs;

public class TC_Logintest_002 extends BaseClass {
	
	@Test
	public void logintest()
	{
		driver.get(baseURL);
		
		logger.info("url is opened");
		
		Loginpage1Swaglabs lp=new Loginpage1Swaglabs(driver);
		lp.setusername(username);
		logger.info("username is entered");
		
		lp.setpassword(password);
		logger.info("password is entered");
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Swag Labs"))
		{
			Assert.assertTrue(true);
			logger.info("test is passed");
			
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("test is failed");
		}
	}

}
