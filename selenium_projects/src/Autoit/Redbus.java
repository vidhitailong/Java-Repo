package Autoit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\goswa\\OneDrive\\Desktop\\Autoit\\redbus.exe");
		
}
}