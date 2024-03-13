package selenium_prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Even_Href {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("(//a)[position()mod 2=0]"));
		int count =links.size();
		System.out.println(count);
		for(int i=0; i<count;i++)
		{
			
			WebElement link = links.get(i);
			 String txt=link.getAttribute("href");
			 System.out.println(txt);
			 Thread.sleep(50);
			
			
		}
	}

}
