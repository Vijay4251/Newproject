package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumxpathexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("vijay");
		
		WebElement name = driver.findElement(By.xpath("//input[@id='first_name']"));
		name.sendKeys("vijay");
		
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("hdsuhj123@gmail.com");
		Select jobrole = new Select(driver.findElement(By.xpath("//select[@id='job_role']")));
		jobrole.selectByVisibleText("Developer");
		jobrole.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("abc");
		
		Select drpcountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		drpcountry.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("585355");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dsghfkgy@gmail.com");
		driver.findElement(By.xpath("//input[@id='submit_btn']")).click();
		//driver.quit();

	}

}
