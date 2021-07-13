package com.Pavanselframework.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.Custmisedstamnt;
import com.Pavanselframework.pageobjects.LoginpageGuru99;

import junit.framework.Assert;


public class TC_Custmigedstatement_01 extends BaseClass {
	
	@Test
	public void ministat() throws InterruptedException, IOException{
		
		LoginpageGuru99 lp = new LoginpageGuru99(driver);
		
		lp.setusername(username);
		
		lp.setpassword(password);
		
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		Custmisedstamnt cm = new Custmisedstamnt(driver);
		cm.clickministat();
		
		cm.Accountno("94755");
	    logger.info("Account number entered");
		cm.frmdate("07", "09", "2021");
		logger.info("from date is provided");
		cm.todate("07", "09", "2021");
		logger.info("To date is provided");
		cm.mintranval("10000");
		logger.info("Amount entered");
		cm.nooftrans("3");
		logger.info("entered number of transactions");
		cm.clicksubmit();
		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("Transaction Details for Account No: 94755 from Date: 2021-07-09 to: 2021-07-09");
		if(res==true) 
		{
			Assert.assertTrue(true);
			logger.info("login passed");
		}
		else 
		{
			capturescreen(driver , "ministat");
			Assert.assertTrue(false);
			logger.info("login failed");
		}
	}

}
