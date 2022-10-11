package com.sauce.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass
{
	WebDriver driver;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	WebElement addtocart;
	public void clickAddtocart()
	{
		addtocart.click();
	}
	
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	public void clickcart()
	{
		cart.click();
	}
	
	
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	WebElement remove;
	public void clickRemove()
	{
		remove.click();
	}
	
	
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	public void clickCheckout()
	{
		checkout.click();
	}
	
	
	
	
	
	
	public CartPagePOMClass(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}

}
