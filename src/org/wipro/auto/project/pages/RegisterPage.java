package org.wipro.auto.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.auto.project.utilitiesPkg.ReadPropFile;

public class RegisterPage {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_registerbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelementprop("home_register_xpath"))).click();
	}
	
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelementprop("fb_login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementprop("fb_login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelementprop("fb_login_loginbttn_css"))).click();
	}
}
