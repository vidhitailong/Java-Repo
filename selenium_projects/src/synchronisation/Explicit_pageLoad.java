package synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_pageLoad {
	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
			Thread.sleep(1000);
			WebDriverWait wait= new WebDriverWait(driver,15);
			WebElement ele = driver.findElement(By.xpath("//a[text()='Open In New Tab']"));
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			
		}

	}
}
