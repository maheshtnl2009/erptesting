package com.ERPAnalysts.pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler.Filter;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;

public class errorscreenshot {
	public static WebDriver driver;
	
	public  void loginfailure(){
		
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
		
		driver.findElement(By.id("pwd")).sendKeys("//Fru4ujas");
		driver.findElement(By.xpath(".//*[@id='login']/div/div[1]/div[9]/input")).click();
		
		
	}
	

	public static void main(String[] args) {
		
		errorscreenshot es=new errorscreenshot();
		es.loginfailure();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String out = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss'.png'").format(new Date());
		File dir = new File ("C:\\loginsuccessfolder");
		File actualFile = new File (dir, out);
		try {
			//FileUtils.copyFile(scrFile, new File("C:\\Selenium\\1.png"));
			FileUtils.copyFile(scrFile, actualFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
