package stepDefinition;


import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;







public class BaseTest {
	//protected WebDriver base_test_driver;
	
	public WebDriver base_test_driver=null;
	
	@BeforeClass
	
	public void open_browser() throws InterruptedException
	{
	//  ouvrir chrome pour l'operateur
		

		String expectedtitle = "CI/CD Master Class By Abhishek Veeramalla";
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		base_test_driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		base_test_driver = new ChromeDriver();
		
		base_test_driver.get("http://51.91.204.153:30751/");
		
		// hard assert
		
		String actualtitle = base_test_driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		
		base_test_driver.manage().window().maximize();
		
			  	  
	}
	
	
	

	
	
	
	@AfterClass
	  
	  public void close_browser() throws InterruptedException {
		if (base_test_driver != null)
		{
		base_test_driver.close();
		}
		   
	  }
	
}
