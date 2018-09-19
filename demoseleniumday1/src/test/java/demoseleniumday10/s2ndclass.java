package demoseleniumday10;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class s2ndclass {
	
	/*@Test
	public void test()
	{
		System.out.print("test");
	}*/
	
	@DataProvider(name="DataUse")
	public String[][] getdata()
	{
		String obj[][]= {{"https://www.seleniumhq.org/","sele link"},{"http://www.google.com","google link"}};
		return obj;
	}
	
	@DataProvider(name="DataUse1")
	public String[][] getdata1()
	{
		String obj[][]= {{"https://www.seleniumhq.org/","sele link"},{"http://www.google.com","google link"}};
		return obj;
	}
	
	

}
