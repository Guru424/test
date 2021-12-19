package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlert {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	WebElement username=driver.findElement(By.name("txtUserName"));
	username.sendKeys("Guru");
	
	driver.findElement(By.name("Submit")).click();
	
	//Handle the alert
	Alert alert=driver.switchTo().alert();
	
	System.out.println(alert.getText());
	
	alert.accept();
	
	//Clear the user name
	username.clear();
	username.sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	
	driver.findElement(By.name("Submit")).click();
	
	driver.close();
}
}
