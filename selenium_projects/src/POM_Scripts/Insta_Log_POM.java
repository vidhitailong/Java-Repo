package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insta_Log_POM {
	
	@FindBy(name="username")
	private WebElement UName;
	@FindBy(name="password")
	private WebElement Pwd;
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement Login;
	
	public Insta_Log_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void uname_Log(String UN)
	{
		UName.sendKeys(UN);
	}
	public void password_Log(String PWD)
	{
		Pwd.sendKeys(PWD);
	}
	public void But_Log()
	{
		Login.click();
	}

}
