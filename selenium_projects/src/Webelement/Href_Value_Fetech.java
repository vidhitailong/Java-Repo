package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Href_Value_Fetech {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	List<WebElement> links =driver.findElements(By.tagName("a"));
	Thread.sleep(2000);
	for( WebElement link : links)
	{
		
		String txt=link.getAttribute("href");
		System.out.println(txt);
		
	}
}
}
