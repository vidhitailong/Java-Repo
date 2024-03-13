package Xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_Maps_Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']")).sendKeys("Mysore");

}
}