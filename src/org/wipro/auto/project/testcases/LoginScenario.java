package org.wipro.auto.project.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.project.basePkg.BrowserInitiatie;
import org.wipro.auto.project.dataGenerator.TestDataGenerator;
import org.wipro.auto.project.pages.LoginPage;

public class LoginScenario extends BrowserInitiatie
{

	@Test
	public void loginFunctionaility() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
				
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		
		login.click_loginbttn();
	}
	
	
	
	
}
