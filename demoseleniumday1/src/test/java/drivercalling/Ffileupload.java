package drivercalling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class Ffileupload {
	
	WebDriver driver;
	String brow="chrome";
	WebElement E2;
	
	@BeforeMethod
public void callb() throws InterruptedException
	
	{
		Alldrivers a1= new Alldrivers();
		driver=a1.getBrowser(brow);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");

}

	@AfterMethod
	public void close()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}
	
@Test	
	public void Filuplod() throws AWTException, InterruptedException
	{
		
	StringSelection sel = new StringSelection("C:\\Users\\A07208trng_b4a.04.28\\Desktop\\test2.png");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	
	 System.out.println("selection" +sel);
	 
		 driver.findElement(By.xpath("/html/body/div[1]/div/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]")).click();
		 
			
		 
		 Robot rob=new Robot();
		 
		 
		//rob.keyPress(KeyEvent.VK_ENTER);
	//	rob.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(1000);
		 
		 rob.keyPress(KeyEvent.VK_CONTROL);
		 rob.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 rob.keyRelease(KeyEvent.VK_CONTROL);
		 rob.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		 
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		
	}
	
	}

