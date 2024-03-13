package selenium_prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cbox_asc_des {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver" , "./Selenium_Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/CBAscDes.html");
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("//input"));
	int count =links.size();
	for(int i=0; i<count;i++)
	{
		
		WebElement link = links.get(i);
		link.click();
		Thread.sleep(1000);
		

}
	Thread.sleep(1000);
	for(int i=count-1; i>=0;i--)
	{
		
		WebElement link = links.get(i);
		link.click();
		Thread.sleep(50);
		}
	}
}

