package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatecommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://developer.salesforce.com/signup");//opens the url (first URL webpage)
		System.out.println(driver.getTitle());
		
		
		driver.navigate().to("https://www.facebook.com/");//navigate to facebook url (second URL webpage)
		System.out.println(driver.getTitle());
		
		driver.navigate().back();//navigate to https://developer.salesforce.com/signup (back to first URL webpage)
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();//navigate to  https://www.facebook.com/ (back to second URL webpage)
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();//refresh the current URL page
		
		driver.close();

	}

}
