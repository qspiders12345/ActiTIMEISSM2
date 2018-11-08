package com.actiTIME.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTIME.generics.ExcelLibrary;

public class POMActiTIMELoginPage 
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public POMActiTIMELoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		String un=ExcelLibrary.getcellValue("E:/ISSM2/SampleFrameworkData.xlsx", "Sheet1", 4, 0);
		String pwd=ExcelLibrary.getcellValue("E:/ISSM2/SampleFrameworkData.xlsx", "Sheet1", 4, 1);
		usernameTextfield.sendKeys(un);
		passwordTextfield.sendKeys(pwd);
		loginButton.click();
	}
}