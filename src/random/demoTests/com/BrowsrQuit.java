package random.demoTests.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BrowsrQuit 
{
	public static WebDriver driver;	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study software\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("tabButton")).click();	
		driver.quit();
		driver.get("https://demoqa.com/browser-windows");
	}
}