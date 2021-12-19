package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	//Enter the frame
	driver.switchTo().frame("rightMenu");
	//Click on add button
	driver.findElement(By.xpath("//div[@class='actionbuttons']/input")).click();
	
	driver.findElement(By.name("txtEmpLastName")).sendKeys("prakash");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Guru");
	driver.findElement(By.cssSelector(".savebutton")).click();
	
	//Exit the frame
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Logout")).click();
	
	driver.quit();
}
}
