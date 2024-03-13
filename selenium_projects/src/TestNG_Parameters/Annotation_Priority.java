package TestNG_Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotation_Priority {
	public class InstaLogin_Test {
		@Test 
		public void login() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			Reporter.log("Launch the borwser", true);
			driver.get("https://www.intsagram.com");
			Reporter.log("Launch the url", true);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("vidhi");
			Reporter.log("Email Entered", true);
			Thread.sleep(5000);
			driver.close();
	}

		@Test(enabled=false)
		public void login_fb() throws InterruptedException
		{
			System.setProperty("webdriver.edge.driver", "./Selenium_Softwares/msedgedriver.exe");
			WebDriver driver= new EdgeDriver();
			Reporter.log("Launch the borwser", true);
			driver.get("https://www.facebook.com");
			Reporter.log("Launch the url", true);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys("vidhi");
			Reporter.log("Email Entered", true);
			Thread.sleep(2000);
			driver.close();
	}
	
		@Test(priority=2, invocationCount=2)
		
			public void youtube() throws InterruptedException
			{
			System.setProperty("webdriver.edge.driver", "./Selenium_Softwares/msedgedriver.exe");
			WebDriver driver= new EdgeDriver();
			Reporter.log("Launch the borwser", true);
			driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=14773373800975759269&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062068&hvtargid=kwd-10573980&hydadcr=14453_2371562");
			Thread.sleep(3000);
			WebElement ele= driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='twotabsearchtextbox']"));
			ele.sendKeys("television");
	         Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @class='nav-input nav-progressive-attribute']")).click();
	       Thread.sleep(2000);
	 	driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal' and @target='_blank']")).click();
	   	Thread.sleep(5000);
	   	WebElement ele1= driver.findElement(By.xpath("//span[text()='Results']/../../../../../../div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//a/span/following-sibling::span/../../../..//a/span[1]/../../..//h2"));
	   	ele1.click();
			
		}
	}

}
