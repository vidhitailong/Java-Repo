package Runner_Scripts;

import org.testng.annotations.Test;

import Generic_POM_Script.Generic;
import POM_Scripts.Yahoo_Login_POM;

public class Yahoo_Runner extends Generic {
	
	@Test
	public void Login() throws InterruptedException {
		Yahoo_Login_POM ab= new Yahoo_Login_POM(driver);
		Thread.sleep(5000);
	ab.UserN("data");	
	}

}
