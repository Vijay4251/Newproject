package com.Pavanselframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FundTransfer {
	
	WebDriver ldriver;
	
	public FundTransfer(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver , this);
	}
	
     @FindBy(how = How.XPATH , using = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[10]/a[1]")
     @CacheLookup
     WebElement clickfundtransfer;
     
     @FindBy(how = How.NAME , using= "payersaccount")
     @CacheLookup
     WebElement txtpayers;
     
     @FindBy(how = How.NAME , using = "payeeaccount")
     @CacheLookup
     WebElement txtpayees;
     
     @FindBy(how = How.NAME , using ="ammount")
     @CacheLookup
     WebElement txtamount;
     
     @FindBy(how = How.NAME , using = "desc")
     @CacheLookup
     WebElement txtdiscrpn;
     
     @FindBy(how = How.NAME , using = "AccSubmit")
     @CacheLookup
     WebElement txtsubmit;
     
     public void clickfundtrs()
     {
    	 clickfundtransfer.click();
     }
     
     public void pyrsaccnt(String psacc)
     {
    	 txtpayers.sendKeys(psacc);
     }
     
     public void payesaccnt(String pyacc)
     {
    	 txtpayees.sendKeys(pyacc);
     }
     
     public void amunt(String amnt)
     {
    	 txtamount.sendKeys(amnt);
     }
     
     public void discription(String disc)
     {
    	 txtdiscrpn.sendKeys(disc);
     }
     
     public void submit()
     {
    	 txtsubmit.click();
     }
}
