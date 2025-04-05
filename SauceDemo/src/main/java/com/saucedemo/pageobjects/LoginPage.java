package com.saucedemo.pageobjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.baseclass.Base;

public class LoginPage extends Base{
	

	public LoginPage() throws IOException {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "user-name")
	WebElement txtusername;

	@FindBy(id = "password")
	WebElement txtpwd;

	@FindBy(id = "login-button")
	WebElement btnLogin;

	@FindBy(xpath = "//div[@class='login_logo']")
	WebElement logo;

	public void login(String uname, String pwd) 
	{
		
		//txtusername.clear();
		txtusername.sendKeys(uname);
		txtpwd.sendKeys(pwd);
		btnLogin.click();
		System.out.println("Login successful");
	}
}