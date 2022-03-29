package random.demoTests.com;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class demo1 
{
	public WebDriver driver;
	public void switchTabs() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study software\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String mainWindow=driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(mainWindow);
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(1));
	}
}
class TabSwitch
{
public static void main(String[] args) throws Exception
{
	demo1 object=new demo1();
	object.switchTabs();	
}
}