package com.Pavanselframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Addcustomer {
	
	
	WebDriver ldriver;
	
	public  Addcustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement lnkAddCustomer;
	
	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtcustomername;
	
	@FindBy(how = How.NAME , using = "rad1")
	@CacheLookup
	WebElement rdgender;
	
	@FindBy(how = How.ID_OR_NAME , using= "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.NAME , using = "addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how = How.NAME , using = "city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how = How.NAME , using = "state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how = How.NAME , using = "pinno")
	@CacheLookup
	WebElement txtpinnumber;
	
	@FindBy(how = How.NAME , using = "telephoneno")
	@CacheLookup
	WebElement txtphonenumber;
	
	@FindBy(how = How.NAME , using = "emailid")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how = How.NAME , using = "password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how = How.NAME , using="sub")
	@CacheLookup
	WebElement txtsubmit;
	
	public void clickaddcustomer()
	{
		lnkAddCustomer.click();
	}
	
	public void customername(String cname)
	{
		txtcustomername.sendKeys(cname);
	}
	
	public void gender(String cgender)
	{
		rdgender.click();
	}
	
	public void dateb(String mm , String dd ,String yy )
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custaddress(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void custstate(String cstate)
	{
		txtstate.sendKeys(cstate);
	}
	
	public void custpinno(String cpinno)
	{
		txtpinnumber.sendKeys(String.valueOf(cpinno));
	}
	
	public void custphone(String cphone)
	{
		txtphonenumber.sendKeys(cphone);
	}
	
	public void custemail(String cemail)
	{
		txtemailid.sendKeys(cemail);
	}
	
	public void custpass(String cpass)
	{
		txtpassword.sendKeys(cpass);
	}
	
	public void csubmit()
	{
		txtsubmit.click();
	}
	
}
