package com.Pavanselframework.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.LoginpageGuru99;
import com.Pavanselframework.pageobjects.Ministat;

import junit.framework.Assert;

public class TC_MiniStat_01 extends BaseClass {
	
	@Test
	public void ministat() throws InterruptedException, IOException
	{
		LoginpageGuru99 lp = new LoginpageGuru99(driver);
		
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		Ministat mn = new Ministat(driver);
		
		mn.clkminista();
		mn.Accntno("96117");
		mn.submit();
		
		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("Last Five Transaction Details for Account No: 96117");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("login pass");
		}
		else
		{
			capturescreen(driver , "ministat");
			Assert.assertTrue(false);
			logger.info("login failed");
		}
	}

}
