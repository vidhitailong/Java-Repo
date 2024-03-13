package Runner_Scripts;

import org.testng.annotations.Test;

import Generic_POM_Script.Generic;
import Generic_POM_Script.Generic_1;
import POM_Scripts.Insta_Log_POM;


public class Insta_Login_Runner extends Generic_1 {
	@Test
	public void insta_Login() throws InterruptedException {
	Thread.sleep(5000);
		Insta_Log_POM Il= new Insta_Log_POM(driver);
		 Il.uname_Log("vidhitailong");
		 Thread.sleep(2000); 
		 Il.password_Log("Yuvaan*2019");
		 Thread.sleep(3000);
		 Il.But_Log();
		 
		 Thread.sleep(6000);
}}
