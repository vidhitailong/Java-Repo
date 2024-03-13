package Runner_Scripts;

import org.testng.annotations.Test;

import Generic_POM_Script.Generic;
import POM_Scripts.Insta_Log_POM;

public class Runner_Insta_New extends Generic {

	@Test
	public void Login_ins() throws InterruptedException
	{
		Insta_Log_POM a= new Insta_Log_POM(driver);
		a.uname_Log("vidhitailong");
		Thread.sleep(2000);
		a.password_Log("Yuvaan*2019");
		Thread.sleep(2000);
		a.But_Log();
	}
}
