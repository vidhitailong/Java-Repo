package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/frames/mainpage.html");
		WebElement txt2=driver.findElement(By.id("t2"));
		Thread.sleep(2000);
		txt2.sendKeys("abc");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement txt1= driver.findElement(By.id("t1"));
		txt1.sendKeys("123");
		Thread.sleep(2000);
		WebElement CB= driver.findElement(By.id("c1"));
		CB.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		txt2.clear();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		txt1.clear();
		Thread.sleep(2000);
		CB.click();
		
				
		
	}

}
