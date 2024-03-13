package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_SD_Foreach {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/CBAscDes.html");
		List<WebElement> cbox = driver.findElements(By.tagName("input"));
		for(WebElement a : cbox)
		 {
			 a.click();
			 Thread.sleep(50);
			
		 }
	 Thread.sleep(1000);
		int count=cbox.size();
	
	 for(int i=count-1; i>=0 ;i--)
		 {
		
			 WebElement cbox1=cbox.get(i);
		 cbox1.click();
			 Thread.sleep(50);
			
			 
		 }
		
	}

}
