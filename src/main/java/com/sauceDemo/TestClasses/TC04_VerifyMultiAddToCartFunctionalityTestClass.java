package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauce.POMClasses.HomePagePOMClass;
import com.sauce.POMClasses.LoginPagePOMclass;


public class TC04_VerifyMultiAddToCartFunctionalityTestClass extends TestBaseClass
{
	@Test
	public void VerifyMultiAddToCartFunctionalityTestClass()
	{
		
		HomePagePOMClass all = new HomePagePOMClass(driver);
		all.clickmultiaddtocart();
		String actual = all.getMultiTextFromAddtoCart();
		log.info("all product is selected");
		String expected = "6";
		Assert.assertEquals(actual, expected);
		
	}

}
