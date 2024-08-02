package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase
{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully()
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration("ismail", "saleh", "4 Maadi Street", "Cairo", "CA" , "1234" , "01151279132" , "2345" , "ismailSaleh211299" , "12345678");
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your account was created successfully. You are now logged in."));
	}
	
	@Test(dependsOnMethods= {"UserCanRegisterSuccssfully"})
	public void RegisteredUserCanLogout() 
	{
		registerObject.userLogout();
	}


	@Test(dependsOnMethods= {"RegisteredUserCanLogout"})
	public void RegisteredUserCanLogin() 
	{
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin("ismailSaleh211299", "12345678");
		Assert.assertTrue(homeObject.transferFundslink.getText().contains("Transfer Funds"));
	}
}
