package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_TN {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/locator.html");
			
Thread.sleep(5000);
driver.findElement(By.tagName("a")).click();

}
}
