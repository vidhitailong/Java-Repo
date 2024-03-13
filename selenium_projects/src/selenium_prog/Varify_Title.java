package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Varify_Title {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		String title= driver.getTitle();
		String url= driver.getCurrentUrl();
		
		if(title.equals("title"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is wrong");
		}
		if(url.equals("url"))
		{
			System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is wrong");
		}
	}

}
