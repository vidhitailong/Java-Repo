package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgSrc_Fetech {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> links =driver.findElements(By.tagName("img"));
		Thread.sleep(2000);
		for( WebElement src : links)
		{
			
			String txt=src.getAttribute("src");
			System.out.println(txt);
			
		}
	}
	}



