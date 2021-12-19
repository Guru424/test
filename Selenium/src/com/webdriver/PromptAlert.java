package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlert {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///D:/LiveTech/Automation/HTML%20Programs/answerOnNextPrompt.html%20.html");
	
	driver.findElement(By.linkText("Click here to enter your name")).click();
	
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("Guruprakash");

	alert.accept();
	
	
}
}
