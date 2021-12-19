package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetValuesDrop {

	public static void main(String[] args) {
		

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/LiveTech/Automation/HTML%20Programs/goBackAndWait.html");
		
		WebElement dropdown=driver.findElement(By.name("OptWeb"));
		
		Select select=new Select(dropdown);
		List<WebElement> listDrop=select.getOptions();
		int size=listDrop.size();
		System.out.println("Total number of values in drop down ="+size);
		String txt="Portnov";
		for(int i=0;i<size;i++){
			String value=listDrop.get(i).getText();
			System.out.println(value);
			
			if(txt.equals(value)){
				select.selectByValue(value);
			}
		}
	}
}
