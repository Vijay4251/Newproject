package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooksignuppage {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.xpath("//input[@id='u_0_j_a7']")).sendKeys("abfjrk");
		driver.findElement(By.xpath("//input[@id='u_0_l_0r']")).sendKeys("eyhhdj");
		driver.findElement(By.xpath("//input[@id='u_0_o_/k']")).sendKeys("9164546179");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abcdef@123");
		Select date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByValue("15");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByValue("Aug");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByValue("1995");

	}

}
