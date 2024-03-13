package Xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_pg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=2114723002&activity=header-mail&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%2F%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail");
	Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//input[@id='login-username']"));
	ele.sendKeys("vidhitailonggos@yahoo.com");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='login-signin'and @name='signin']")).click(); 
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Anshushalu@2014");
	 Thread.sleep(3000);
 driver.findElement(By.xpath("//button[@id='login-signin']")).click(); 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("vidhitailonggoswamy@yahoo.com");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("Test Message");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hello how are you?");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@type='button' and @title='Send this email']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//label[@id='ybarAccountMenuOpener']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='Sign out']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@class='icon mail']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[@class='pure-button puree-button-link add-account page-button-link']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("vidhitailonggoswamy@yahoo.com");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='login-signin'and @name='signin']")).click(); 
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Anshushalu@2024");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='login-signin']")).click(); 
		 Thread.sleep(1000);
	 
	 

		
		
	}
}
