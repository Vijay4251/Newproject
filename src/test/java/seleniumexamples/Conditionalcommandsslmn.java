package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcommandsslmn {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));// first identify the element then value stored in email varaible 
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));// first identify the element then value stored in pass varaible
		
		if(email.isDisplayed() && email.isEnabled())// here AND Operator is used bcz when both (means email.isdisplyed and email.isenabled) returns true then enter the value
		{
			email.sendKeys("vijay@gmail.com");
		}
        
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("abc123458");
		}
		
		System.out.println(driver.findElement(By.xpath("")));
	}

}
//.isdisplayed method when returns true then element is displayed on webpage and it returns false then element is not displayed in webpage.

//.isenabled method when returns true then element is enabled in webpage and it returns false then element is not enabled in webpage.

//.isselected method is used to 