package Mouse_Act_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverandClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=2");
		Thread.sleep(5000);
		WebElement cli = driver.findElement(By.xpath("(//*[local-name()='svg' and @stroke='currentColor'])[3]")); 
		Actions act= new Actions(driver);
		act.moveToElement(cli).click().perform();
		

	}
}
