package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {
public static void main(String[] args) {
	
	 	WebDriver driver=new FirefoxDriver();
	 	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	 	
	 	String HomepageTitle=driver.getTitle();
	 	System.out.println("Home page title is ="+HomepageTitle);
	 	
	 	if(HomepageTitle.equals("OrangeHRM - New Level of HR Management")){
	 		System.out.println("Home page title matched...");
	 	}else{
	 		System.out.println("Home page title not matched...");
	 	}
	 	
	 	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	 	driver.findElement(By.xpath("//input[@class='loginText'][@name='txtPassword']")).sendKeys("admin");
	 	driver.findElement(By.cssSelector(".button")).click();
	 	
	 	String AdminpageTitle=driver.getTitle();
	 	if(AdminpageTitle.equals("OrangeHRM")){
	 		System.out.println("Admin page title matched...");
	 	}else{
	 		System.out.println("Admin page title not matched...");
	 	}
	 	
	 	driver.findElement(By.linkText("Logout")).click();
	 	
	 	driver.close();
}
}
