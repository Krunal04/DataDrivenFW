package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import driverexe.DriverExe;
import page.LoginPage;

public class ProfileCreate extends DriverExe {

	public ProfileCreate() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(priority = 1)
	public void profilecreatetest () throws InterruptedException {
		
     LoginPage pc = new LoginPage (driver);    
     pc.profilecreate(prop.getProperty("EMAIL"), prop.getProperty("PASSWORD"));
     
	}
     
	
	
	

}
