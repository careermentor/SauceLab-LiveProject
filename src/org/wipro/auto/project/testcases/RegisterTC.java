package org.wipro.auto.project.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.project.basePkg.BrowserInitiatie;
import org.wipro.auto.project.pages.RegisterPage;

public class RegisterTC extends BrowserInitiatie
{

	@Test
	public void registerFunctionaility() throws Exception
	{
		RegisterPage reg = new RegisterPage(driver);
		
		reg.click_registerbttn();	
		
		
		
	}
	
	
	
	
}
