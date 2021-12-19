package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://jqueryui.com/droppable/");
	
	driver.switchTo().frame(0);
	Actions action=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	
	action.dragAndDrop(source, target).perform();
	
}
}
