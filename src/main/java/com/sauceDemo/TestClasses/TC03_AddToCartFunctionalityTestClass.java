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

public class TC03_AddToCartFunctionalityTestClass extends TestBaseClass
{
	
	@Test
	public void AddToCartFunctionalityTestClass() throws IOException 
	{
		HomePagePOMClass hm = new HomePagePOMClass(driver);
		hm.clicktobag();
		String expected = "1";
		String text = hm.getTextFromAddtoCart();
		System.out.println(text);
		Assert.assertEquals(expected, text);
	}
}
