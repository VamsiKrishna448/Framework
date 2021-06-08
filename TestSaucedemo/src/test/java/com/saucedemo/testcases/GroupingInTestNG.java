package com.saucedemo.testcases;

import org.testng.annotations.Test;

public class GroupingInTestNG {
	
	
	@Test(groups={"regression"})
	public void test1(){
		System.out.println("Test1");
		
	}
	
	@Test(groups={"regression","sanity"})
   public void test2(){
		System.out.println("Test2");
	}
	
	@Test(groups={"sanity"})
   public void test3(){
		System.out.println("Test3");
	}

	

}
