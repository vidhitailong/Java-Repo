package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner_Fb_Login {

	@Test
	public void fb_login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./New_Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 POM_FB_Login fl= new POM_FB_Login(driver);
		 fl.userName("vidhitailong");
		 Thread.sleep(2000);
		 fl.password("Anshushalu@2014");
		 Thread.sleep(2000);
		 fl.login();
		 
	}
}
