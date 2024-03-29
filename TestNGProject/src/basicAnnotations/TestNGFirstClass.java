package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGFirstClass {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class 1");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class 1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@Test
	public void test1()
	{
		System.out.println("Class 1 - Test 1");
	
	}
	@Test
	public void test2()
	{
		System.out.println("Class 1 - Test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Class 1 - Test 3");
	}
}
