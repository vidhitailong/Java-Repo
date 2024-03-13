package Generic_POM_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Generic {
		
		public WebDriver driver;
		
		@BeforeMethod
		public void open_App() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./New_Software/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
			driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=header-mail&pspid=2114723002&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail&add=1");
			  Thread.sleep(5000);
		}
		
		@AfterMethod
		public void close() {
			driver.close();
			
		}

	}
