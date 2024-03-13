package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_script.Generic_Fetch_Data;
import net.bytebuddy.description.type.TypeDescription.Generic;

public class InstaInput_Excel
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		String val=Generic_Fetch_Data.getData("./Excel/DDT.xlsx", "Sheet1", 9, 0);
		ele.sendKeys(val);
	Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.xpath("//input[@aria-label='Password']"));
		String val1=Generic_Fetch_Data.getData("./Excel/DDT.xlsx", "Sheet1", 10, 0);
	ele1.sendKeys(val1);
		
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
	WebElement s = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	Thread.sleep(3000);
	String val2=Generic_Fetch_Data.getData("./Excel/DDT.xlsx", "Sheet1", 12, 0);
	s.sendKeys(val2);
//	driver.findElement(By.xpath("//span[text()='smitamohanta22']")).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//div[text()='Follow']")).click();
//	
	
	}
	

}

