package com.Pavanselframework.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiocheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radio1= driver.findElement(By.id("vfb-7-1"));
		WebElement radio2= driver.findElement(By.id("vfb-7-2"));
		
		radio1.click();
		
		System.out.println("radio button 1 is selected");
		
		radio2.click();
		
		System.out.println("radio button 2 is selected");
// selecting checkbox
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		
		if(option1.isSelected()){
			System.out.println("checkbox is selected");
		} else
		{
			System.out.println("checkbox is deselected");
		}
	}

}
