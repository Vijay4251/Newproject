package com.Pavanselframework.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dispselena {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		
		boolean eledisplayed = driver.findElement(By.xpath("//a[normalize-space()='Sent']")).isDisplayed();
		System.out.println("element is displayed" +eledisplayed);

	}

}
