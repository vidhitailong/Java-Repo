package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector_Css2 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.cssSelector("input[id='search']"));
		ele.sendKeys("ganeshji aarti");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);

}
}