package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/frames/MainpageT1.html");
		WebElement txt3=driver.findElement(By.id("T3"));
		Thread.sleep(2000);
		txt3.sendKeys("abc");
		driver.switchTo().frame("mainpage");
		Thread.sleep(2000);
		WebElement txt2= driver.findElement(By.id("t2"));
		txt2.sendKeys("123");
		Thread.sleep(2000);
		driver.switchTo().frame("Frame1");
		WebElement txt1= driver.findElement(By.id("t1"));
		txt1.sendKeys("xyz");
		Thread.sleep(1000);
		txt1.clear();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		txt2.clear();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		txt3.clear();
	}

}
