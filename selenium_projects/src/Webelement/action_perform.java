package Webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class action_perform {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals(title))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("Wrong");
		}
	
		
		
	}

}
