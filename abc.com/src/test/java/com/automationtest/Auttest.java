package com.automationtest;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ERPAnalysts.pages.GenerateResults;

public class Auttest {

	public static GenerateResults gr=new GenerateResults();
	
	@BeforeMethod
	public static void test01(){		
	}
	
	@Test
	public static void test02(){		
	//gr.pt();
	gr.wf();
	}
	
	@AfterMethod
	public static void test03(){
		
	}
	
	
}
