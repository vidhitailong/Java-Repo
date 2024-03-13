package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/frames/MultiFMain.html");
		WebElement txt3=driver.findElement(By.id("T1"));
		Thread.sleep(2000);
		txt3.sendKeys("abc");
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		WebElement txt2= driver.findElement(By.id("t2"));
		txt2.sendKeys("123");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement txt1= driver.findElement(By.id("t3"));
		txt1.sendKeys("xyz");
		Thread.sleep(1000);
		txt1.clear();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		txt2.clear();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		txt3.clear();
	}

}
