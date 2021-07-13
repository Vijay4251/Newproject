package com.Pavanselframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewAccntguru99 {
	
	WebDriver ldriver;
	
	public NewAccntguru99(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this);
		
	}
	
	@FindBy(how = How.XPATH , using = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[5]/a[1]")
	@CacheLookup
	WebElement clicknewaccount;
	
	@FindBy(how = How.NAME , using="cusid")
	@CacheLookup
	WebElement txtcustid;
	
	@FindBy(how = How.NAME , using = "selaccount")
	@CacheLookup
	WebElement txtaccount;
	
	@FindBy(how = How.NAME , using = "inideposit")
	@CacheLookup
	WebElement txtdeposit;
	
	@FindBy(how= How.NAME , using = "button2")
	@CacheLookup
	WebElement submit;
	
	public void clicknewaccnt()
	{
		clicknewaccount.click();
	}
	
	public void custmrid(String cid)
	{
		txtcustid.sendKeys(cid);
	}
	
	public void savingaccnt(String sav)
	{
		txtaccount.sendKeys(sav);
	}
	
	public void intialdepo(String num)
	{
		txtdeposit.sendKeys(num);
	}
	
	public void submt()
	{
		submit.click();
	}

}
