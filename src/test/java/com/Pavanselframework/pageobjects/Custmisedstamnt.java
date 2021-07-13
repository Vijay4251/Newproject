package com.Pavanselframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Custmisedstamnt {
	
	WebDriver ldriver;
	
	public Custmisedstamnt(WebDriver rdriver){
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver , this);
	}
	
	

	@FindBy(how = How.XPATH , using = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[14]/a[1]")
	@CacheLookup
	WebElement clickcuststat;
	
	@FindBy(how = How.NAME , using = "accountno")
	@CacheLookup
	WebElement txtaccno;
	
	@FindBy(how = How.NAME , using = "fdate")
	@CacheLookup
	WebElement txtfromdate;
	
	@FindBy(how = How.NAME , using ="tdate")
	@CacheLookup
	WebElement txttodate;
	
	@FindBy(how = How.NAME , using = "amountlowerlimit")
	@CacheLookup
	WebElement txtmintrans;
	
	@FindBy(how = How.NAME ,using = "numtransaction")
	@CacheLookup
	WebElement txtnotrans;
	
	@FindBy(how = How.NAME , using ="AccSubmit")
	@CacheLookup
	WebElement txtsubmit;
	
	
	public void clickministat()
	{
		clickcuststat.click();
	}
	public void Accountno(String accntno)
	{
		txtaccno.sendKeys(accntno);
	}
	
	public void frmdate(String mm , String dd , String yy)
	{
		txtfromdate.sendKeys(mm);
		txtfromdate.sendKeys(dd);
		txtfromdate.sendKeys(yy);
	}
	public void todate(String mm , String dd , String yy)
	{
		txttodate.sendKeys(mm);
		txttodate.sendKeys(dd);
		txttodate.sendKeys(yy);
	}
	public void mintranval(String minamnt)
	{
		txtmintrans.sendKeys(minamnt);
	}
	public void nooftrans(String noamnt)
	{
		txtnotrans.sendKeys(noamnt);
	}
	public void clicksubmit()
	{
		txtsubmit.click();
	}
	

}
