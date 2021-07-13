 package com.Pavanselframework.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pavanselframework.pageobjects.LoginpageGuru99;
import com.Pavanselframework.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_001 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void LOginDDT(String user , String pwd) throws InterruptedException
	{
		LoginpageGuru99 lp = new LoginpageGuru99(driver);
		lp.setusername(user);
		logger.info("username provided");
		
		lp.setpassword(pwd);
		logger.info("password provided");
		
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();//back to login page
			Assert.assertTrue(false);
			logger.warn("login failed");
		}
		else{
			Assert.assertTrue(true);
			logger.info("login passed");
			lp.clicklogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
		}
	}
		
		public boolean isAlertPresent()
		{
			try
			{
				driver.switchTo().alert();
				return true;
			}
			catch(NoAlertPresentException e)
			{
				return false;
			}
		}
	

	@DataProvider(name="LoginData")
	String [] [] getdata() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/Pavanselframework/testdata/LoginData.xlsx";
		
		int rowcount = XLUtils.getRowCount(path , "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String [rowcount][colcount];
		
		
		for(int i=1; i<=rowcount; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}

}
