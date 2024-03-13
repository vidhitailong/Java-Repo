package Mouse_Act_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(5000);
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']")); 
		WebElement dst= driver.findElement(By.id("bank"));
		Actions act= new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		
	}
}
