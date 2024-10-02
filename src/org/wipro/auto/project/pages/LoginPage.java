package org.wipro.auto.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.auto.project.utilitiesPkg.ReadPropFile;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelementprop("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelementprop("login_password_id"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelementprop("login_loginbttn_id"))).click();
	}
}
