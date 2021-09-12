package practiceexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsercommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "F:\\webdrivers\\chromedriver\\chromedriver.exe");
		//InternetExplorerDriver driver = null;
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.shop.demoqa.com");
		//driver.get("https://www.google.com/");
		//driver.getTitle();
		//driver.getCurrentUrl();
		//driver.getPageSource();
		//driver.close();
		//driver.quit();

	}

}
