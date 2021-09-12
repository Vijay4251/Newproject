package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://developer.salesforce.com/signup");//opens the url in browser
		
		System.out.println(driver.getCurrentUrl());//returns the current URL of the webpage
		System.out.println(driver.getTitle());//returns the title of the page
		String text= driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).getText();
		System.out.println(text);
		
		//driver.close();//it closes only one window at a time
		driver.quit();//it closes all windows at a time

	}

}
