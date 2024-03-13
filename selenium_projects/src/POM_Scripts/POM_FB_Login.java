package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_FB_Login {
	@FindBy(id="email")
	private WebElement UName;
	@FindBy(id="pass")
	private WebElement Pwd;
	@FindBy(name="login")
	private WebElement Login;
	//Initialization
	public POM_FB_Login(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	//Utilization
	
public void userName(String username) 
{
	UName.sendKeys(username);
	
}
	public void password(String password) {
		Pwd.sendKeys(password);
		
	}
public void login() {
	Login.click();
}
}
