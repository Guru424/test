package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='leave']/a/span"))).perform();
	Thread.sleep(1000);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='leave']/ul/li[2]/a/span"))).perform();
	Thread.sleep(1000);
	action.moveToElement(driver.findElement(By.xpath(".//*[@id='leave']/ul/li[2]/ul/li[1]/a/span"))).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='leave']/ul/li[2]/ul/li[1]/a/span")).click();
	
	driver.close();
}
}
