package com.actiTIME.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public WebDriver driver;
	
	public void dropdownbyindex(WebElement ele, int index)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(index);
	}
	
	public void dropdownbyvalue(WebElement ele, String value)
	{
		Select sel=new Select(ele);
		sel.selectByValue(value);
	}
	
	public void dropdownbyvisibletext(WebElement ele, String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void getitle()
	{
		System.out.println(driver.getTitle());
	}
}