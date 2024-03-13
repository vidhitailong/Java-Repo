package Popups_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Div_Pp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='13']")).click();
	}

}
