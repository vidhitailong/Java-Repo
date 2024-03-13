package Runner_Scripts;

import org.testng.annotations.Test;

import Generic_POM_Script.Generic;
import POM_Scripts.POM_FB_Login;

public class FB_Runner_Script extends Generic {
	@Test
	public void fb_login() throws InterruptedException {
	
		 POM_FB_Login fl= new POM_FB_Login(driver);
		 fl.userName("vidhitailong");
		 Thread.sleep(2000);
		 fl.password("Anshushalu@2014");
		 Thread.sleep(2000);
		 fl.login();
		 
	}
}

 
