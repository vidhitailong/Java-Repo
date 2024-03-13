package TestNG_2Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class Regression {

	@Test
	
	public static void add() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./New_Software/chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		Thread.sleep(2000);
        opt.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.youtube.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		System.out.println("1");
		}
	
}
