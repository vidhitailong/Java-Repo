package Webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webele1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	
Thread.sleep(1000);
String url=driver.getCurrentUrl();
if(url.equals(url))
{
	System.out.println("correct");
}
else
{
	System.out.println("Wrong");
}

		
	}


}
