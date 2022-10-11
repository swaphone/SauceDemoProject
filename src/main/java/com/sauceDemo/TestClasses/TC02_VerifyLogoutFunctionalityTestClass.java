package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.POMClasses.HomePagePOMClass;
import com.sauce.POMClasses.LoginPagePOMclass;


public class TC02_VerifyLogoutFunctionalityTestClass extends TestBaseClass
{

	@Test
	public void VerifyLogoutFunctionalityTestClass()
	{
		
		HomePagePOMClass h = new HomePagePOMClass(driver);
		h.clickMenuButton();
		h.clickLogout();
				
	
		String tittle = driver.getTitle();
		String expected = "Swag Labs";
		Assert.assertEquals(tittle, expected);
	

	}
	

}
