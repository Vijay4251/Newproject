package com.Pavanselframework.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.LoginpageGuru99;
import com.Pavanselframework.pageobjects.NewAccntguru99;

import junit.framework.Assert;

public class TC_NewAccnt_01 extends BaseClass {
	
	@Test
	public void newaccount() throws InterruptedException, IOException
	{
		LoginpageGuru99 lp = new LoginpageGuru99(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		NewAccntguru99 newaccnt=new NewAccntguru99(driver);
		newaccnt.clicknewaccnt();
		newaccnt.custmrid("23325");
		newaccnt.savingaccnt("Savings");
		newaccnt.intialdepo("10000");
		newaccnt.submt();
		
		Thread.sleep(2000);
		boolean res = driver.getPageSource().contains("Account Generated Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("login is passed");
		}
		
		else
		{
			capturescreen(driver , "newaccount");
			Assert.assertTrue(false);
			logger.info("login failed");
		}
	}

}
