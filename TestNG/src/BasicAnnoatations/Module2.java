package BasicAnnoatations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Module2 
{
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Module2");
	}
	@AfterClass
	public void AfterModule()
	{
		System.out.println("After Module2");
	}
	
@BeforeMethod	
	public void beforeTestScript()
	{
		System.out.println("Before Test Script2");
		
	}

@AfterMethod
	public void afterTestScript()
	{
		System.out.println("After Test Script2");
		
	}
	
	
	@Test
public void test3()
{
	System.out.println("Login test case2");
}

	@Test
public void test4()
{
	System.out.println("Logout test case2");
}
@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
}
