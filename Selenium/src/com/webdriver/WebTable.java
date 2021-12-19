package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
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
 	
 	driver.switchTo().frame("rightMenu");
 	
 	List<WebElement> rowlist=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr"));
 	int rows=rowlist.size();
 	System.out.println("Total number of rows ="+rows);
 	
	List<WebElement> columnlist=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr[1]/td"));
 	int columns=columnlist.size();
 	System.out.println("Total number of columns ="+columns);
 	
 	for(int i=1;i<=rows;i++){
 		for(int j=1;j<=columns;j++){
 	String txt=driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
 	System.out.print(txt+" ");
 	
 	}
 		
 		System.out.println();
}
}
}