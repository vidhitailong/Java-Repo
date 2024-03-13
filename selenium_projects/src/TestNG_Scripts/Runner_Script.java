package TestNG_Scripts;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class Runner_Script extends Generic_Script
{
@Test
public void playSong() 
{
	
	 driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='twotabsearchtextbox']")).sendKeys("television");
   
driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @class='nav-input nav-progressive-attribute']")).click();
   
	//driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal' and @target='_blank']")).click();
	
	// driver.findElement(By.xpath("//span[text()='Results']/../../../../../../div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//a/span/following-sibling::span/../../../..//a/span[1]/../../..//h2")).click();
}
@Test
public void playsong1() {
	
	 driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='twotabsearchtextbox']")).sendKeys("television");
	   
	 driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @class='nav-input nav-progressive-attribute']")).click();
	    
	 	driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal' and @target='_blank']")).click();
	 	
	  driver.findElement(By.xpath("//span[text()='Results']/../../../../../../div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//a/span/following-sibling::span/../../../..//a/span[1]/../../..//h2")).click();
}
}
