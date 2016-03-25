package com.ERPAnalysts.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class time  {
	public  WebDriver driver;
	public  void gettimedata(){
			driver.switchTo().frame("ptifrmtgtframe");
	WebElement totaltime=driver.findElement(By.id("DERIVED_PTP_PTP_TOTAL_TIME"));
	 WebElement browsertime=driver.findElement(By.id("DERIVED_PTP_PTP_WBNW_TIME"));
	 WebElement webservertime=driver.findElement(By.id("DERIVED_PTP_PTP_WSNW_TIME"));
	 WebElement appservertime=driver.findElement(By.id("DERIVED_PTP_PTP_ASNW_TIME"));
	 WebElement dbtime=driver.findElement(By.id("DERIVED_PTP_PTP_DB_TIME"));
	  
String total= totaltime.getAttribute("value");
String browtime=browsertime.getAttribute("value");
String webtime=webservertime.getAttribute("value");
String apptime= appservertime.getAttribute("value");
String databasetime=dbtime.getAttribute("value");

System.out.println("total value in time is :"+total);
System.out.println("browtime value in time is :"+browtime);
System.out.println("webtime value in time is :"+webtime);
System.out.println("apptime value in time is :"+apptime);
System.out.println("databasetime value in time is :"+databasetime);

System.out.println("-----------------------------------------");
}
}