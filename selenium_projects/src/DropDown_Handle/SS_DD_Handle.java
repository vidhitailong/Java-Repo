package DropDown_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SS_DD_Handle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/Dropdowm.html");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("Menu"));
		
		Select sel= new Select(dd);
		List<WebElement> opt = sel.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(WebElement a:opt)
		{
			String txt = a.getText();
			System.out.println(txt);
		}
		boolean b= sel.isMultiple();
		if(b)
		{
			System.out.println("MultiSelect");
		}
		else
		{
			System.out.println("SingleSelect");
		}
	}

}
