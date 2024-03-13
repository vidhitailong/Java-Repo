package DropDown_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_DD_Handle {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement ele= driver.findElement(By.xpath("//a[text()='Create new account']"));
		ele.click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Vidhi");
		WebElement ele1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel= new Select(ele1);
		Thread.sleep(1000);
		sel.selectByValue("1");		
	
		WebElement ele2=driver.findElement(By.xpath("//select[@id='month']"));
		Select sel2= new Select(ele2);
		sel2.selectByVisibleText("Mar");
		
		Thread.sleep(1000);
		
		WebElement ele3= driver.findElement(By.xpath("//select[@id='year']"));
		Select sel3= new Select(ele3);
		sel3.selectByValue("1990");
		
		Thread.sleep(1000);
		
		sel.selectByValue("2");
		boolean b=sel3.isMultiple();
		if(b)
		{
			System.out.println("it is single");
			
		}
		else
		{
			System.out.println("multiple");
		}
}
}
