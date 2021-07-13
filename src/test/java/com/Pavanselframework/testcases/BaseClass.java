package com.Pavanselframework.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Pavanselframework.utilities.Readconfig;

public class BaseClass {
	
	Readconfig readconfig = new Readconfig();
	
	//guru99 bank application
	/*public String baseURL="http://demo.guru99.com/v4/";
	public String username="mngr338707";
	public String password="agerUtY";
	public static WebDriver driver;*/
	
	//Readconfiguration concept
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	//swag labs application
	/*public String baseURL="https://www.saucedemo.com/";
	public String username="standard_user";
	public String password="secret_sauce";
	public static WebDriver driver;*/
	
	public static Logger logger;
	 
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		logger = Logger.getLogger("ebanking");
		//logger = Logger.getLogger("swaglabs");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		
		if(br.equals("chrome"))
		{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxpath());
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
				
	}
	
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	public void capturescreen(WebDriver driver , String tname) throws IOException{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("screenshot taken");
	}
	
	public String randomestring()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}

}

