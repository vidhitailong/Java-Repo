package DropDown_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_Handle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shaadi.com/");
	driver.findElement(By.xpath("((//div[@class='Dropdown-control'])[1])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Man']")).click();
}
}
