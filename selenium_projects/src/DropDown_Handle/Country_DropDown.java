package DropDown_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Country_DropDown {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/Locator/CountryDD.html");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("Country"));
		
		Select sel= new Select(dd);
		sel.selectByVisibleText("INDIA");
		Thread.sleep(1000);
		sel.selectByValue("c");
		Thread.sleep(1000);
		sel.selectByVisibleText("France");
		Thread.sleep(1000);
		List<WebElement> opts = sel.getAllSelectedOptions();
		for(WebElement opt:opts)
		{
			String txt = opt.getText();
		
			if(txt.equals("INDIA"))
			{
				System.out.println("INDIA is present");
				
			}
		
			
			
		
		}
}
}



