package TestNG_Scripts;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Script {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void open_App() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./New_Software/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=18091125079104993801&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062066&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		
	}

}
