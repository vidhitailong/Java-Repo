package DropDown_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDText_Fetch {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/Dropdowm.html");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("Menu"));
		Select sel= new Select(dd);
		List<WebElement>  opts=sel.getOptions();
		int count= opts.size();
		System.out.println(count);
	for(WebElement opt: opts)
	{
		String txt= opt.getText();
		System.out.println(txt);
	}
	}
	
}
