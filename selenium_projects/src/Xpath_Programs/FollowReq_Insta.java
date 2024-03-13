package Xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowReq_Insta {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		ele.sendKeys("vidhitailong");
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.xpath("//input[@aria-label='Password']"));
		ele1.sendKeys("Anshushalu@2019");
		Thread.sleep(2000);
		WebElement ele2= driver.findElement(By.xpath("//button[@type='submit']"));
		ele2.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Search']/../../../../../../../../../../div[2]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("smitamohanta22");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='smitamohanta22']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Follow']")).click();
		
}
}
