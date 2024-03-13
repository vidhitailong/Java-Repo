package Generic_POM_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_1 {
	public WebDriver driver;
	
	@BeforeMethod
	public void open_App() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./New_Software/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		  Thread.sleep(1000);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		
	}

}

