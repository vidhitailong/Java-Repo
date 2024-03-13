package Mouse_Act_Handle;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(5000);
	WebElement click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")); 
	Actions act= new Actions(driver);
	act.doubleClick(click).perform();
	
}

}
