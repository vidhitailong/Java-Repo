package Popups_Handle;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Child_Browser_Popup {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev");
		 WebElement d = driver.findElement(By.xpath("//span[text()='Downloads']"));
		 WebElement d1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
         WebElement d2 = driver.findElement(By.xpath("//span[text()='Projects']"));
         WebElement d3 = driver.findElement(By.xpath("//span[text()='Support']"));
		 WebElement d4 = driver.findElement(By.xpath("//span[text()='Blog']"));
         Robot r= new Robot();
		 Actions act= new Actions(driver);
		 
		 act.contextClick(d).perform();
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);
		 
		 
         act.contextClick(d1).perform();
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);
		 
		 
			 act.contextClick(d2).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
			 act.contextClick(d3).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
			 act.contextClick(d4).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	
		
		 Set<String> all_id = driver.getWindowHandles();
		 
		 ArrayList<String> arr_list= new  ArrayList<String>(all_id);
		 String f_id=arr_list.get(2);
		 driver.switchTo().window(f_id);
		 
		
	}

}
