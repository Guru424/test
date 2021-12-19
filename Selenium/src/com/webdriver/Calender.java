package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	
	driver.findElement(By.id("onward_cal")).click();
	
	String mon="July 2020";
	
	while(true){
	String month=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
	if(month.equals(mon)){
		break;
	}else{
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
	}
	
	}
	
	driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[3]")).click();
}
}
