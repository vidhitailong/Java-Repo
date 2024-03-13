package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yahoo_Login_POM {
	
	@FindBy(id="login-username")
	private WebElement UN;
	
	public Yahoo_Login_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void UserN(String u1) {
		UN.sendKeys(u1);
	}

}
