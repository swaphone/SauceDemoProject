package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sauce.POMClasses.LoginPagePOMclass;


public class TC01_VerifyLoginFunctionalityTestClass extends TestBaseClass
{
	
	@Test
	public void VerifyLoginFunctionalityTestClass() throws IOException
	{
		String actual= driver.getTitle();
		System.out.println(actual);
		String expected = "Swag Labs";
		Assert.assertEquals(actual, expected);
		
		
//		SoftAssert soft  =new SoftAssert();
//		soft.assertEquals(actual, expected);
//		soft.assertAll();
				
	
		
	}
	

}
