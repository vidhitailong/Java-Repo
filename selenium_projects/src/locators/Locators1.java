package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/Webpage.html");
				
	Thread.sleep(2000);
	driver.findElement(By.id("i2")).sendKeys("XYZ");
	Thread.sleep(2000);
	WebElement ele= driver.findElement(By.id("i1"));
	ele.clear();
	Thread.sleep(2000);
	driver.findElement(By.name("n1")).sendKeys("manager");
	Thread.sleep(2000);
	WebElement ele1= driver.findElement(By.className("c1"));
	ele1.clear();
	driver.findElement(By.id("i3")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("i4")).click();
	
	
	
	


}
}
