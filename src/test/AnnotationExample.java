package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {
	
	@BeforeGroups("sanity")
	
	public void BeforeG() {
		System.out.println("Inside Before Group");
		
	}
	
    @BeforeTest
	
	public void BeforeT() {
		System.out.println("Inside Before Test");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void BeforeM() {
		System.out.println("Inside Before Method");
	}
	
	@Test(groups= {"sanity"})
	
	public void test1(){
		
		System.out.println("Inside Test Case 1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("Inside Test Case 2");
	}
	
	@AfterMethod
	
	public void AfterM() {
		System.out.println("Inside After Method");
	}
	
@AfterTest
	
	public void AfterT() {
		System.out.println("Inside After Test");
	}
	

}
