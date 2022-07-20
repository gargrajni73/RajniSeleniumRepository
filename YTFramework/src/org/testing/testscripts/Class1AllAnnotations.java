package org.testing.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1AllAnnotations {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite Annotation");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class Annotation");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test Annotation");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method Annotation");
	}
	
	@Test(dependsOnMethods="test2")    		//It will execute at second
	public void test()
	{
		System.out.println("Test Annotation");
	}
	
	@Test(priority=1)						//It will execute at third
	public void test1()
	{
		System.out.println("Test1 Annotation");
	}
	
	@Test(priority=0)
	public void test2()						//It will execute at first
	{
		System.out.println("Test2 Annotation");
	}
	
	@Test(enabled=false)
	public void test3()						//To skip a testcase in TestNG
	{
		System.out.println("Test3xxx Annotation");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite Annotation");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method Annotation");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test Annotation");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class Annotation");
	}
	
}
