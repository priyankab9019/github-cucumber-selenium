package hrm.test.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hrm.drivermanager.com.InitializeDriver;
import hrm.main.com.Login;

public class TC001_Login 
{
	WebDriver driver;
	 @Test
	  public void beforeTest() 
	  {
		 InitializeDriver.OpenBrowser("chrome");
		 Login.log_in();
	  }
	 
	 public void loginHRM()
	 {
				 
	 }

}
