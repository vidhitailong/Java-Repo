package TestNG_Scripts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sort_DD {

	@Test
	public static void sort() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Users/goswa/OneDrive/Desktop/Advance%20Selenium/TestNG_Scripts/DD_Month.html");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("Months"));
		Select sel= new Select(dd);
		List<WebElement> opt = sel.getOptions();
		
	TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
	
		
		for(WebElement opts:opt)
		{	
       String txt = opts.getText();
       ts.add(txt); 
     
		}
	int txt = ts.size();
	
			
	for(String tss:ts)
	{
		String tsss = tss.toString();
	
		System.out.println(tsss);	
	
	}
	

		
	
	}
	
	
}

