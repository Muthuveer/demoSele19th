package drivercalling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CallBrow extends Storeobjects {
	
	WebDriver driver;
	String brow="chrome";
	WebElement E2;
	WebElement E233;
	

	/*
	@Test
	public void openbrowser() throws InterruptedException
	
	{
		Alldrivers a1= new Alldrivers();
		driver=a1.getBrowser(brow);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https:www.flipkart.com");
		
		
	/*	WebElement E1= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		
		Select Selc=new Select(E1);
		
		Selc.selectByIndex(2);
		
		Thread.sleep(1000);
		
		Selc.selectByVisibleText("IRELAND");
		
		List<WebElement> options = Selc.getOptions();
		
		System.out.println("total"+options.size());*
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("total links:"+Links.size());
		
	for(int i=0;i<Links.size();i++)
		
	{
		
		if(Links.get(i).getText() != "") {
		System.out.println("Total Links:"+Links.get(i).getText());}
	}
		
		driver.quit();
		
	
		
		
		
		
		
		
		
	/*	WebElement E1= driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		E1.click();
		Thread.sleep(100);
	WebElement E2= driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
	
		Storeobjects s1= new Storeobjects();
		 s1.getelement().sendKeys("Shoes");;
		E2.sendKeys("Phones");

	WebElement E3= driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button"));
	
	E3.click();

	driver.navigate().back();
	
	E2.clear();
	E2.sendKeys("watches");
	E3.click();
	
	
	}
	
	*/
	/*
	@Test
	public void alert1() {
		
		Alldrivers a1= new Alldrivers();
		driver=a1.getBrowser(brow);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https:www.goibibo.com");
		
		driver.findElement(By.id("get_sign_in")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("authiframe")));
		
		driver.findElement(By.id("authMobile")).sendKeys("345455656");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"authOverlay\"]/div/a")).click();
		
		
	}*/
	
	
	@Test
	
	public void swiching11() throws InterruptedException
	{
	Alldrivers a1= new Alldrivers();
	driver=a1.getBrowser(brow);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com");
	
//	driver.findElement(By.xpath("//*[@id=\"socialThings2\"]/ul/li[1]/a")).click();
	
	String S2= driver.getWindowHandle();
			
	Set<String> S1= driver.getWindowHandles();
			
	//Iterator<String> it=S1.iterator();

	
	for(String x:S1)
	{
		if (!x.equals(S2))
		{
			driver.switchTo().window(x);
			driver.close();
		}
	}
	
	
//	System.out.println(org+"test2"+tab1);
	
	//driver.switchTo().window(tab1);
	
	Thread.sleep(2000);
	
//	driver.findElement(By.id("email")).sendKeys("muthu");
	
	driver.switchTo().window(S2);
	

	WebElement r1= driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a/div"));
	
	Actions mouse=new Actions(driver);
	
	mouse.moveToElement(r1).perform();
	
	
	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/div/ul/li[2]/a")).click();
	
	driver.switchTo().window(S2);
	
	
	
	
	
    WebElement src1= driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[1]/div/ul/li[5]/a"));
	WebElement tar= driver.findElement(By.xpath("//*[@id=\"qsbClick\"]/span[1]"));
	
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"block\"]")).click();
	
	driver.switchTo().window(S2);
	
//	Thread.sleep(2000);
	
	//tar.click();
	
//	Thread.sleep(2000);
	
	//WebElement src2=driver.findElement(By.xpath("//*[@id=\"skill\"]/div[1]/div[2]/input"));

	
	//mouse.dragAndDrop(src1, src2).perform();
	
	Thread.sleep(2500);
	
	WebElement src3= driver.findElement(By.xpath("/html/body/div[2]/div/a"));
	
	mouse.contextClick(src3).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();

	Thread.sleep(2500);
	
	}
}