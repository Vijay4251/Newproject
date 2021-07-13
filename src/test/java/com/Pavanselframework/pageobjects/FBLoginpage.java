package com.Pavanselframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginpage {
	WebDriver ldriver;
	
	public FBLoginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
	    PageFactory.initElements(rdriver , this);
	}
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="pass")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement btnlogin;
	
	
	public void setusername(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		btnlogin.click();
	}
	
	

}
