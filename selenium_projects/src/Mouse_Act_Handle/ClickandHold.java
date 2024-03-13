package Mouse_Act_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(5000);
		WebElement circle = driver.findElement(By.id("circle")); 
		Actions act= new Actions(driver);
		act.clickAndHold(circle).perform();
		Thread.sleep(2000);
		act.release(circle).perform();
		

}
}
