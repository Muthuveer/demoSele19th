package demoseleniumday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1seleniumtest1 extends s2ndclass {
	
	WebDriver driver=new ChromeDriver();
	
	//Se2ndclass s2 =new Se2ndclass();
	
	@Test(priority=2,enabled=true,dataProvider="DataUse1")
	public void testcase1(String cname,String name) throws InterruptedException 
		{
			driver.get(cname);
		System.out.println(name);
		//Assert.assertEquals("Google","Google", driver.getTitle());
	}
	
	/*@Test(priority=1)
	public void testcase2() throws InterruptedException 
	
	{
			
		driver.get("https://www.seleniumhq.org/");
		
	}
	*/
	
	@BeforeMethod
public void openbrowser()

{System.setProperty("webdriver.chrome.driver","C://chromeDriver.exe");	


		}
	
	@AfterMethod
	public void closebrowser()
	{
		
		System.out.println("testcomplete");
		
	}
	
	@AfterClass
	public void closeing()
	
	{driver.quit();
	}
	
	@BeforeTest
	public void beftest()
	{
		
		System.out.println("Beforetest");
		
	}

	/*@DataProvider(name="DataUse")
	public String[][] getdata()
	{
		String obj[][]= {{"https://www.seleniumhq.org/","sele link"},{"http://www.google.com","google link"}};
		return obj;
	}*/
}
