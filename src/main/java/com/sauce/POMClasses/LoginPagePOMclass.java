package com.sauce.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMclass 
{
//	step1 declare the varible globlaly
	
	public WebDriver driver;
	
//	Step2 to find the element by annotation
	
	@FindBy(xpath ="//input[@id='user-name']")
	private WebElement username;
	
//	Step3 to create method as per action
//	and add action in that method
	public void sendUsername()
	{
	username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
	
	public void clickLogin()
	{
		login.click();
	}
	
//	Step4 to create the constructor
	
	public LoginPagePOMclass(WebDriver driver)
	{      //global    //local
		this.driver = driver;
		
		
//		sele class
		PageFactory.initElements(driver, this);
		
	}
	
	
	

}
