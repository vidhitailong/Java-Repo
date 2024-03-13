package Xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_byattri {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//input[@id='search']"));
		ele.sendKeys("ganeshji aarti");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
     	driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
     	Thread.sleep(5000);
     	WebElement ele1=driver.findElement(By.xpath("//span[text()='Share']/../../../../..//segmented-like-dislike-button-view-model//div[1]//like-button-view-model//button"));
     	ele1.click();
     	
     	

}
}
