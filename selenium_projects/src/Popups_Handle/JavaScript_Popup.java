package Popups_Handle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("5246436");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(1000);
		Alert alt= driver.switchTo().alert();
		String txt=alt.getText();
		System.out.println(txt);
		//alt.accept();
		alt.dismiss();
		
	}
}
