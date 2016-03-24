package com.automationtest;
import java.sql.SQLException;

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
	public static void test02() throws ClassNotFoundException, SQLException{		
		gr.pt();
	//gr.wf();
	gr.readdata();
	
	
	}
	
	@AfterMethod
	public static void test03(){
		
	}
	
	
}
