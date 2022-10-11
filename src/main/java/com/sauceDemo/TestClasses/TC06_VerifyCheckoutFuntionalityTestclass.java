package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.POMClasses.CartPagePOMClass;
import com.sauce.POMClasses.CheckoutPOMclass;


public class TC06_VerifyCheckoutFuntionalityTestclass extends TestBaseClass
{
	@Test
	public void VerifyCheckoutFuntionalityTestclass()

	{		
		CartPagePOMClass b = new CartPagePOMClass(driver);
		b.clickAddtocart();
		b.clickcart();
		b.clickRemove();
		b.clickCheckout();
				
	
		CheckoutPOMclass a = new CheckoutPOMclass(driver);
		a.SendFirstname();
		a.SendLastname();
		a.SendPostalCode();
		a.clickContinue1();
		a.clickFinish();
		a.clickbackhome();
		
		System.out.println("end of the program");
		
		
	}

}
