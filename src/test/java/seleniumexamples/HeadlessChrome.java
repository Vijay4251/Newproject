package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//headless browser opertion here dont open the webpage and execution process is done on background only
		ChromeOptions option = new ChromeOptions();
		//option.setHeadless(true);
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://developer.salesforce.com/signup");
		System.out.println("title of the webpage is:" + driver.getTitle());

	}

}
