package Xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_restro {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.zomato.com/bangalore");
	Thread.sleep(3000);
	WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish' and @class='sc-iysEgW jGCDDj']"));
    ele.sendKeys("Ner.lu Cafe");
    Thread.sleep(1000);
   ele.click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//div[@class='sc-fATqzn jTgEBX']")).click();
 
}
}
