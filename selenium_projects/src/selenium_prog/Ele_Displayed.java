package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Displayed {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/htmlpage2.html");
	Thread.sleep(2000);
	WebElement ele= driver.findElement(By.id("cbox"));
	boolean b= ele.isSelected();
	if(b)
	{
		System.out.println("The ele is selected");
	}
	else
	{
		System.out.println("The element is not selected");
	}
}
}
