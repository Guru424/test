package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/LiveTech/Automation/HTML%20Programs/goBackAndWait.html");
		
		driver.findElement(By.name("OptWeb")).sendKeys("Google");
		driver.findElement(By.name("btnGo")).click();
		
		driver.navigate().back();
		
		//Select class
		WebElement drop=driver.findElement(By.name("OptWeb"));
		Select select=new Select(drop);
		select.selectByValue("Microsoft");
		driver.findElement(By.name("btnGo")).click();
		
		
		
	}
}
