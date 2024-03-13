package selenium_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Url {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.facebook.com/"))
		{
		System.out.println("the url is correct");
		
	}
		else
		{
			System.out.println("the url is incorrect");
		}
			
		}

}
