package Autoit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file://C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/uploadpopup.html");
		Thread.sleep(5000);
	
		//driver.findElement(By.id("file"));
		//.sendKeys("C:\\Users\\goswa\\OneDrive\\Desktop\\Advance Selenium\\Locator\\uploadpopup.html");
	Runtime.getRuntime().exec("C:\\Users\\goswa\\OneDrive\\Desktop\\Autoit\\Autoit1.exe");
	
	}

}
