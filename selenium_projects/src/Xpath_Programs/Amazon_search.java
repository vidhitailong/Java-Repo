package Xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=14773373800975759269&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062068&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='twotabsearchtextbox']"));
		ele.sendKeys("television");
         Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @class='nav-input nav-progressive-attribute']")).click();
       Thread.sleep(2000);
 	driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal' and @target='_blank']")).click();
   	Thread.sleep(5000);
   	WebElement ele1= driver.findElement(By.xpath("//span[text()='Results']/../../../../../../div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//a/span/following-sibling::span/../../../..//a/span[1]/../../..//h2"));
   	ele1.click();
	//driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @data-hover='Select <b>__dims__</b> from the left<br> to add to Shopping Cart']")).click();

}
}
