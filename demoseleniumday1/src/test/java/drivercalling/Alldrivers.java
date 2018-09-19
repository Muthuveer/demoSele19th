package drivercalling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alldrivers {
	
	
	public WebDriver getBrowser(String brow)
	{
		
		if(brow.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A07208trng_b4a.04.28\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		return driver;
				
		}
		
		else if(brow.equalsIgnoreCase("Firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			return driver;
		}
		
		else
		{
			System.out.println("no driver");
			return null;
		}
	}
	

}
