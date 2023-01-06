package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Parameters({"URL"})  //only this test method can use this parameter
	@Test
	public void Demo(String urlname)
	{
		System.out.println("hello");
		System.out.println(urlname);
	}
	
	@Test(groups={"Smoke"})
	public void Demo2()
	{
		System.out.println("hello2");
	}

}
