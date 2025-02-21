package com.testNG;

import org.testng.annotations.Test;

public class SkippedTest 
{
	@Test
	public void A() 
	{
		System.out.println("Inside A");
	}
	
	
	
	@Test(enabled=false)
	public void B() 
	{
		System.out.println("Inside B");
	}
}
