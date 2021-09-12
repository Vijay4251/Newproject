package com.Pavanselframework.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*driver.get("http://uitestpractice.com/Students/Switchto");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='alert' or @xpath='1']")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		//System.out.println("alert is accepted");
		
		//driver.switchTo().alert().dismiss();
		//System.out.println("alert is cancled");
		
		//driver.close();*/
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alertwindow=driver.switchTo().alert();
		System.out.println("the message displed on alert box" + alertwindow.getText());
		Thread.sleep(2000);
		alertwindow.sendKeys("WELCOME");
		alertwindow.accept();
        driver.close();
	}

}
