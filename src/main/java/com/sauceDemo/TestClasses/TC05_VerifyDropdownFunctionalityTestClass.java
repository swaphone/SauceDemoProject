package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.POMClasses.HomePagePOMClass;
import com.sauce.POMClasses.LoginPagePOMclass;



public class TC05_VerifyDropdownFunctionalityTestClass extends TestBaseClass
{
	@Test
	public void VerifyDropdownFunctionalityTestClass()
	{
		
		HomePagePOMClass hm = new HomePagePOMClass(driver);
		hm.clicktodropdown();
		log.info("dropdown is clicked");

	}

}
