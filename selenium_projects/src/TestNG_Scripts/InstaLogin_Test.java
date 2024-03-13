package TestNG_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

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

	@Test
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
}