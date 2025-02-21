package com.testNG;

import org.testng.annotations.Test;

public class DependsOnMethod
{
	
	@Test(dependsOnMethods="method2")
	public void method1() 
	{
		System.out.println("Inside A");
	}
	
	
	
	@Test
	public void method2() 
	{
		System.out.println("Inside B");
	}
}
