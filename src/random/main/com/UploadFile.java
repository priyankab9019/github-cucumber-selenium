package random.main.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class UploadFile 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Study software\\Chrome Driver\\chromedriver.exe");
	     String baseUrl = "http://demo.guru99.com/test/upload/";
	     
	     WebDriver driver = new ChromeDriver();
	    
	    DesiredCapabilities cap= DesiredCapabilities.chrome();
	    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     //driver.manage().window().getSize();
	     driver.get(baseUrl);
	     //click  Browse button 
	 
	     WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
	     Thread.sleep(2000);
	        // enter the file path onto the file-selection input field
	     uploadElement.sendKeys("D:\\JAVA Queries.docx");
	     Thread.sleep(3000);
	        // check the "I accept the terms of service" check box
	     driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	     driver.findElement(By.name("send")).click();	
	     //act.sendKeys().perform();
	     Actions builder = new Actions(driver);
	     Action move=builder.moveToElement(uploadElement).build();
	     FluentWait wait=new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	     
	}
}
