package BasicAnnoatations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module1 
{
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Module");
	}
	@AfterClass
	public void AfterModule()
	{
		System.out.println("After Module");
	}
	
@BeforeMethod	
	public void beforeTestScript()
	{
		System.out.println("Before Test Script");
		
	}

@AfterMethod
	public void afterTestScript()
	{
		System.out.println("After Test Script");
		
	}
	
	
	@Test
public void test1()
{
	System.out.println("Login test case");
}

	@Test
public void test2()
{
	System.out.println("Logout test case");
}

}
