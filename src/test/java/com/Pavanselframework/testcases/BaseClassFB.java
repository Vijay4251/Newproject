package com.Pavanselframework.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClassFB {
	
	public String baseURL="https://www.facebook.com/";
	public String username="9972905625";
	public String password="basav@123";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup (String br)
	
	{
		
		
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--disable-notification");
			options.setUnhandledPromptBehaviour(null);
			driver = new ChromeDriver();
		}
		
		
	
	logger = Logger.getLogger("ebanking");
	PropertyConfigurator.configure("Log4j.properties");
    

	
	driver.get(baseURL);
}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
}
