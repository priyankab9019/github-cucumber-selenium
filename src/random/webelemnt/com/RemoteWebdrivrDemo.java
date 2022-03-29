package random.webelemnt.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebdrivrDemo 
{	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Setup\\SELENIUM STUFF\\Chrome Driver\\32bit\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		RemoteWebDriver Rdriver=new ChromeDriver();		
	}

}
