package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.io.FileOutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Multidata_Write {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fis= new FileInputStream("./Excel/DDT.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.createSheet("Flipkart1");
	System.setProperty("webdriver.chrome.driver", "./Selenium_Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count = links.size();
	System.out.println(count);
	for(int i= 0; i<count; i++)
	{
		WebElement link = links.get(i);
		String atri = link.getAttribute("href");
		Row r = sh.createRow(i);
		Cell c = r.createCell(0);
		c.setCellValue(atri);
	}
	FileOutputStream fout= new FileOutputStream("./Excel/DDT.xlsx");
	
	book.write(fout);
	Thread.sleep(5000);
	for(int i=0; i<count ;i++)
	{
		Sheet sh1 = book.getSheet("Flipkart1");
		Row r = sh.getRow(i);
	            Cell cel = r.getCell(0);
	            String value = cel.toString();	
	            System.out.println(value);;
	}
	
	
	
}
	
	
}
