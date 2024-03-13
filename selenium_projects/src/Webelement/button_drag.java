package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class button_drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/button.html");
		WebElement sourceElement = driver.findElement(By.id("b1"));
		Actions actions = new Actions(driver);
		WebElement targetElement = driver.findElement(By.tagName("body"));
	    actions.dragAndDrop(sourceElement, targetElement).build().perform();

		
	}

}
