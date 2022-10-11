package com.sauce.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPOMclass
{
	WebDriver driver;

	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	public void SendFirstname()
	{
		firstname.sendKeys("Swapnil");
	}
	
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	public void SendLastname()
	{
		lastname.sendKeys("Phatak");
	}
	
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement postalcode;
	public void SendPostalCode()
	{
		postalcode.sendKeys("411038");
		
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue1;
	public void clickContinue1()
	{
		continue1.click();
		
	}
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement finish;
	public void clickFinish()
	{
		finish.click();
		
	}
	
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement backhome;
	public void clickbackhome()
	{
		backhome.click();
		
	}
	
	
	public CheckoutPOMclass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
