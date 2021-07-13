package com.Pavanselframework.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.FundTransfer;
import com.Pavanselframework.pageobjects.LoginpageGuru99;

public class TC_Fundtrs_01 extends BaseClass  {
	
	@Test
	public void fundtransfer() throws InterruptedException, IOException{
		
		LoginpageGuru99 lp = new LoginpageGuru99(driver);
		
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		Thread.sleep(2000);
		
		FundTransfer fd = new FundTransfer(driver);
		fd.clickfundtrs();
		fd.pyrsaccnt("94755");
		fd.payesaccnt("94788");
		fd.amunt("10000");
		fd.discription("amount transfer");
		fd.submit();
		
		Thread.sleep(3000);
		logger.info("validation started");
		
		boolean res = driver.getPageSource().contains("Fund Transfer Details");
				if(res==true)
				{
					Assert.assertTrue(true);
					logger.info("login passed");
				}
				else
				{
					capturescreen(driver , "fundtransfer");
					Assert.assertTrue(false);
					logger.info("login failed");
				}
	}

}
