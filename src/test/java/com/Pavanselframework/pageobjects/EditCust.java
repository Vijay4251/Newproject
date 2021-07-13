package com.Pavanselframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCust {
	
	WebDriver ldriver;
	
	public EditCust(WebDriver rdriver)
	{
	ldriver=rdriver;
	PageFactory.initElements(rdriver , this);
	}
	
	@FindBy(how = How.XPATH , using = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement editcust;
	
	@FindBy(how = How.NAME , using = "cusid")
	@CacheLookup
	WebElement custid;
	
	@FindBy(how = How.NAME , using ="AccSubmit")
	@CacheLookup
	WebElement custsubmit;
	
	@FindBy(how = How.NAME , using = "city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how = How.NAME , using="sub")
	@CacheLookup
	WebElement txtsubmit;

	
	public void clickeditcustomer()
	{
		editcust.click();
	}
	
	public void customerid(String cid)
	{
		custid.sendKeys(cid);
	}
	
	public void cstsubmit()
	{
		custsubmit.click();
	}
	public void cleartxtcity(String newtxt)
	{
		txtcity.clear();
		txtcity.sendKeys(newtxt);
	}
	/*public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}*/
	public void csubmit()
	{
		txtsubmit.click();
	}
}
