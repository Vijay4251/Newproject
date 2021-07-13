package com.Pavanselframework.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.LoginpageGuru99;

public class TC_Logintest_001 extends BaseClass {
	
	@Test
	public void Logintest() throws IOException
	{
		driver.get(baseURL);
		logger.info("url is opened");
		
		LoginpageGuru99 lp=new LoginpageGuru99(driver);
		
		lp.setusername(username);
		logger.info("username is entered");
		
		lp.setpassword(password);
		logger.info("password is entered");
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test pass");
		}
		else
		{
			capturescreen(driver , "Logintest");
			Assert.assertTrue(false);
			logger.info("login test is fail");
		}
	}

}
