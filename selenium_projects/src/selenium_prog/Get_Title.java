package selenium_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("The title is correct");
			
		}
		else
		{
			System.out.println("Title is incorrect");
		}
	}

}
