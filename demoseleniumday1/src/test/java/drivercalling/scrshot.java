package drivercalling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class scrshot {

	
	public static void getscre(WebDriver driver,String filepath) throws IOException
	
	{
		TakesScreenshot ss=((TakesScreenshot)driver);
		
		File src=ss.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(filepath);
		
		FileUtils.copyFile(src, dest);
		
					
	}
	
	
}
