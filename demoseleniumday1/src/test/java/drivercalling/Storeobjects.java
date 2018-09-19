package drivercalling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Storeobjects {

	WebDriver driver;
	
	public WebElement getelement()
	{
		
		WebElement E2= driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
		
		return E2;
	}
}
