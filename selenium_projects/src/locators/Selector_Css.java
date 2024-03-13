package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector_Css {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
		ele.sendKeys("anshumangoswamy");
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.cssSelector("input[aria-label='Password']"));
		ele1.sendKeys("P@ssw0rd@8418");
		Thread.sleep(2000);
		WebElement ele2= driver.findElement(By.cssSelector("button[type='submit']"));
		ele2.click();
		
		
		
		
	}

}
