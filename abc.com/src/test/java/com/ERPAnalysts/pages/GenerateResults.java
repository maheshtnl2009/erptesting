package com.ERPAnalysts.pages;
import com.ERPAnalysts.pages.time;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler.Filter;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;

public class GenerateResults {

	public static WebDriver driver;
	OrclConn oc=new OrclConn();
	  time t=new time();
	public void pt(){
	
	System.setProperty("webdriver.chrome.driver", "E:ohio/erp/selenium/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://pshcm.erpanalysts.com/psp/hr92dmo/?cmd=login");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("userid")).sendKeys("ERPAdmin");
	
	driver.findElement(By.id("pwd")).sendKeys("Fru4ujas");
			
	long start=System.currentTimeMillis();		
	driver.findElement(By.xpath(".//*[@id='login']/div/div[1]/div[9]/input")).click();
	
	driver.navigate().to("http://pshcm.erpanalysts.com/psp/hr92dmo/EMPLOYEE/HRMS/c/UTILITIES.PTPERF_TEST.GBL?PORTALPARAM_PTCNAV=PT_PTPERF_TEST_GBL&EOPP.SCNode=HRMS&EOPP.SCPortal=EMPLOYEE&EOPP.SCName=PT_PEOPLETOOLS&EOPP.SCLabel=PeopleSoft%20Ping&EOPP.SCFName=PT_PEOPLESOFT_PING&EOPP.SCSecondary=true&EOPP.SCPTfname=PT_PEOPLESOFT_PING&FolderPath=PORTAL_ROOT_OBJECT.PT_PEOPLETOOLS.PT_UTILITIES.PT_PEOPLESOFT_PING.PT_PTPERF_TEST_GBL&IsFolder=false");
	//System.out.println("logging out");
	//driver.findElement(By.id("pthdr2logout")).click();
	//long finish=System.currentTimeMillis();
	//long timetaken=finish-start;
	
	//System.out.println(timetaken);
	System.out.println("setting the interval time");
	// System.out.println("total value in time is :"+total);
}

public void wf(){
	System.setProperty("webdriver.chrome.driver", "E:ohio/erp/selenium/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://pshcm.erpanalysts.com/psp/hr92dmo/?cmd=login");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("userid")).sendKeys("ERPAdmin");
	
	driver.findElement(By.id("pwd")).sendKeys("/Fru4ujas");
			
	long start=System.currentTimeMillis();		
	driver.findElement(By.xpath(".//*[@id='login']/div/div[1]/div[9]/input")).click();
	
	driver.navigate().to("http://pshcm.erpanalysts.com/psp/hr92dmo/EMPLOYEE/HRMS/c/ADMINISTER_WORKFORCE_(GBL).JOB_DATA.GBL?PORTALPARAM_PTCNAV=HC_JOB_DATA_GBL&EOPP.SCNode=HRMS&EOPP.SCPortal=EMPLOYEE&EOPP.SCName=HC_WORKFORCE_ADMINISTRATION&EOPP.SCLabel=Job%20Information&EOPP.SCFName=HC_WORKFORCE_INFO&EOPP.SCSecondary=true&EOPP.SCPTfname=HC_WORKFORCE_INFO&FolderPath=PORTAL_ROOT_OBJECT.HC_WORKFORCE_ADMINISTRATION.HC_WORKFORCE_INFO.HC_JOB_DATA_GBL&IsFolder=false");
	driver.switchTo().frame("ptifrmtgtframe");
	try {
		Thread.sleep(5000);
		System.out.println("waiting to load the page");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("EMPLMT_SRCH_COR_EMPLID")).sendKeys("C10002");
	driver.findElement(By.id("#ICSearch")).click();
	try {
		Thread.sleep(3000);
		
		System.out.println("searching the emlployee details");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("take screenshot");
	
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String out = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss'.png'").format(new Date());
	File dir = new File ("C:\\Selenium");
	File actualFile = new File (dir, out);
	try {
		//FileUtils.copyFile(scrFile, new File("C:\\Selenium\\1.png"));
		FileUtils.copyFile(scrFile, actualFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		driver.switchTo().defaultContent();
	//System.out.println("logging out");
//	driver.findElement(By.id("pthdr2logout")).click();
	//long finish=System.currentTimeMillis();
	//long timetaken=finish-start;
	
	//System.out.println(timetaken);
		
	}
 public void readdata() throws ClassNotFoundException, SQLException{
	 driver.switchTo().frame("ptifrmtgtframe");
	 WebElement repeattime=driver.findElement(By.id("DERIVED_PTP_PTP_RPT_TM_INT"));
	 repeattime.sendKeys("10");
	 WebElement runswitch=driver.findElement(By.id("b1"));
	 runswitch.click();try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 //driver.switchTo().defaultContent();
	  	for (int i=1;i<=5;i++){
//	  		try {
//	  			Thread.sleep(5000);
//	  		} catch (InterruptedException e) {
//	  			// TODO Auto-generated catch block
//	  			e.printStackTrace();
//	  		}	 
//		
	//	t.gettimedata();
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
	oc.dbquery(total,browtime,webtime);
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	 
	
	}
	System.out.println("skipped out of for loop");	
	
	 WebElement stopbutton=driver.findElement(By.id("DERIVED_PTP_BTN_CANCEL"));
	 stopbutton.click();
	 System.out.println("stopped the timer");
	
	 }
 
 
}
