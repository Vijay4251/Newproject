package com.Pavanselframework.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.FBLoginpage;

public class FB_TC_Login_01 extends BaseClassFB {
	@Test
	public void logintest() throws IOException
	{
		driver.get(baseURL);
		logger.info("url is opened");
		
		FBLoginpage lp=new FBLoginpage(driver);
		lp.setusername(username);
		logger.info("username provided");
		
		lp.setpassword(password);
		logger.info("password provided");
		
		lp.clicksubmit();
		
		
		
		if(driver.getTitle().equals("Facebook"))
		{
			Assert.assertTrue(true);
			logger.info("login test pass");
		}
		else 
		{
			Assert.assertTrue(false);
			logger.info("login test fail");
		}
	}

}
