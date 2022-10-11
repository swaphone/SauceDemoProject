package com.sauce.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{
    private  WebDriver driver;
	private Select s;
//	---------------------------------------------------------------------------
//	menu button
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menu;
	public void clickMenuButton()
	{
		menu.click();
	}
//	---------------------------------------------------------------------------------------
//	logout button
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	public void clickLogout()
	{
		logout.click();
	}
//	---------------------------------------------------------------------------
//	addtocart
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bag;
	public void clicktobag()
	{
		bag.click();
	}
//	-------------------------------------------------------------------
//	addtocart basket
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtocart;
	public String getTextFromAddtoCart()
	{
		String addtocarttext = addtocart.getText();
		return addtocarttext;
	}
//	-------------------------------------------------------------
	
//	filter
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	public void clickfilter()
	{
		filter.click();
		s.selectByVisibleText("Name (Z to A)");;
	}
//---------------------------------------------------------------------------	
//	multiple addtocart
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private List<WebElement> multiaddtocart;
	public void clickmultiaddtocart()
	{
		for(WebElement a:multiaddtocart)
		{
			a.click();
//			System.out.println(a);
		}	
	}
//	--------------------------------------------------------------------
//	Multiaddtocart basket
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement MultiTextaddtocart;
	public String getMultiTextFromAddtoCart()
	{
		String multiaddtocarttext = MultiTextaddtocart.getText();
		return multiaddtocarttext;
	}
//---------------------------------------------------------------------
//	dropdown
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	public void  clicktodropdown()
	{
		dropdown.click();	

		s.selectByIndex(2);
		
    }
//	------------------------------------------------------------
	 
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	    s = new Select(dropdown);
	}
	

}
