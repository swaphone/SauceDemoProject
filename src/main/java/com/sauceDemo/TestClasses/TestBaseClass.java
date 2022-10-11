package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauce.POMClasses.LoginPagePOMclass;
import com.utility.classes.ScreenShotClass;

public class TestBaseClass
{
	WebDriver driver;
	
	Logger log = Logger.getLogger("SauceDemoP");

	@Parameters("browserName")
	@BeforeMethod
	public void setupmethod(String browserName ) throws IOException
	{
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./DriverFolder\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./DriverFolder\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser is open");
		driver.manage().window().maximize();
		log.info("browser is maximized");
		driver.get("https://www.saucedemo.com/");
		log.info("url is open");
		
		ScreenShotClass.GetScreenShot(driver, "LogInPage");
		
		LoginPagePOMclass x = new LoginPagePOMclass (driver);
		x.sendUsername();
		log.info("username is entered");
		x.sendPassword();
		log.info("password is entered");
		x.clickLogin();
		log.info("login successful");
		ScreenShotClass.GetScreenShot(driver, "HomePage");
	}
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		log.info("end of the programm");
		
	}

}
