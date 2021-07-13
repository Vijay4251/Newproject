package com.Pavanselframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ministat {
	
	WebDriver ldriver;
	
	public Ministat(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver , this);
		
	}
	
	@FindBy(how = How.XPATH , using = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[13]/a[1]")
	@CacheLookup
	WebElement clickministat;
	
	@FindBy(how = How.NAME , using = "accountno")
	@CacheLookup
	WebElement txtaccno;
	
	@FindBy(how = How.NAME , using = "AccSubmit")
	@CacheLookup
	WebElement txtsubmit;
	
	public void clkminista()
	{
		clickministat.click();
	}
	
	public void Accntno(String acc)
	{
		txtaccno.sendKeys(acc);
	}
	
	public void submit()
	{
		txtsubmit.click();
	}

}
