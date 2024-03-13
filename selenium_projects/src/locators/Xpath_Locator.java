package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Locator {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/htmlpage.html");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("html/body/div[1]/input"));
		ele.sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[2]/a")).click();
		Thread.sleep(2000);


}
}
