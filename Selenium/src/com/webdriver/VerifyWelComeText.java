package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyWelComeText {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("GURUC");
	String username=driver.findElement(By.name("txtUserName")).getAttribute("value");
	System.out.println("My username is ="+username);
	
	driver.findElement(By.name("txtPassword")).sendKeys("GURUC");
	driver.findElement(By.name("Submit")).click();
	
	//Get the  welcome text
	String WelcomeText=driver.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
	if(WelcomeText.equals("Welcome "+username)){
		System.out.println("Welcome to "+username);
	}else{
		System.out.println("Welcome text not matched...");
	}
	
	driver.close();
	
	
}
}
