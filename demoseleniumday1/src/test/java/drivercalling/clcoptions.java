package drivercalling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class clcoptions {

	
	WebDriver driver;
	String brow="chrome";
	WebElement E2;
	
@Test
	
	public void swiching12() throws InterruptedException, AWTException, IOException
	{
	Alldrivers a1= new Alldrivers();
	driver=a1.getBrowser(brow);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.google.com");
	
	WebElement xxx= driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[5]"));
	
	Actions Asx=new Actions(driver);
	
	//Asx.contextClick(xxx).perform();
	
//	Robot win= new Robot();
	
//	win.keyPress(KeyEvent.VK_DOWN);
//	win.keyPress(KeyEvent.VK_ENTER);
	
	//Asx.moveToElement(xxx).click().build().perform();
	
	WebElement src= driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[5]"));
	
  WebElement tra= driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
  
  
  Asx.dragAndDrop(src,tra).perform();
  
  scrshot.getscre(driver, "C:\\Users\\A07208trng_b4a.04.28\\Desktop\\Old Firefox Data\\test.png");
  
  
	
	
		
}}
